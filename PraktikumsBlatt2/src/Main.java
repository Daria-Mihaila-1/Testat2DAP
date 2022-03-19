public class Main {

    public static void main(String args[]){
        int[] arr = {1, 3, 5};
        System.out.println(countPositivesLimited(arr, arr.length, arr.length-1));
        System.out.println(isSorted(arr, 2));
        System.out.println(palindromCheck(arr, 2));
    }

    public static int digitSum(int n){
        if (n <= 9 ){
            return n;
        }
        else{
            return n % 10 + digitSum(n / 10);
        }
    }

    public static int countPositivesLimited(int[] arr, int d, int t){
        if (d > t){
            return 0;
        }
        else if ( arr[d] > 0){
            return arr[d] + countPositivesLimited(arr, d+1, t);
        }
        else{
            return countPositivesLimited(arr, d+1, t);
        }
    }

    public static boolean isSorted(int[] arr, int i){
        if (i <= 1){
            return true;
        }
        else if((arr[i] < arr[i-1])){
           return false;
        }
        else{
            return isSorted(arr, i - 1);
        }
    }

    public static boolean palindromCheck(int[] arr, int i){
        if (i == 1){
            return true;
        }
        else if (arr[i] != arr[arr.length - i - 1] ){// i = n - inceput + 1
            return false;
        }
        else return palindromCheck(arr, i - 1);
    }

    /*
    public static int getIndex(int[] arr, int i, int x) {
     
        if ((i < 0) | (i >= arr.length)) {
            return -1;
        }
        else if (i == 0) {
            if (arr[i] != x) {
                return -1;
            }
            else if (arr[i] == x) {
                return i;
            }
        }
        else {
            return getIndex(arr, i - 1, x);
        }
    }*/
}
