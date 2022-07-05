import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);


        System.out.println("Saisir a :");
        int a = input1.nextInt() ;
        System.out.println("Saisir b :");
        int b = input1.nextInt() ;
        System.out.println("Saisir c :");
        int c = input1.nextInt() ;
        System.out.println("Saisir x :");
        double x = input1.nextDouble() ;
        double x2 = Math.pow(x,2) ;
        double x3 = Math.pow(x,3) ;
        double polynome =  ((double)(a+b)/2) * x3 + Math.pow((a+b),2) * x2 + a + b + c ;
        System.out.println(polynome);
    }
}
