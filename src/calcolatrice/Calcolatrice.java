package calcolatrice;

public class Calcolatrice {

    /*supponiamo di avere una calcolatrice */

    public static int add(int a, int b) { return a+b; }
    public static double add (double a, double b) { return a + b; }

    //se non ci fosse l overloading
    public static int sommaIntera(int a, int b) { return a +b; }
    public static double sommaVirgola(double a, double b)  { return a + b;}


    public static void main(String[] args) {


        System.out.println(add(4,5));
        System.out.println(add(4.5,5.2));


    }
}
