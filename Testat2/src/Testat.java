public class Testat
{
    public static Fraction apply( Fraction[] arr, Fraction x )
    {

        Fraction result = new Fraction();
        if (arr.length < 3 | arr.length % 2 == 0){

            Fraction aux = new Fraction(1, 2);
            result = x.multiply(aux);
        }
        else if ( arr.length >= 3 && arr.length % 2 != 0){
            result = x.add(arr[arr.length / 2]);
        }
        return result;
    }
}