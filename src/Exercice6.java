import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez a :");
        int a = input.nextInt();
        System.out.println("Entrez b :");
        int b = input.nextInt();
        System.out.println("Entrez c :");
        int c = input.nextInt();

        double delta = Math.pow(b,2) - 4 * (a*c);

        if(delta < 0){
            System.out.println("L'équation n'a pas de solution");
        }else if(delta == 0){
            int x = b / (2*a) ;
            System.out.print("L'équation a une solution : x = -" + x );
        }else {
          double  x1 = (-b - Math.sqrt(delta)) / (2*a) ;
          double  x2 = (-b + Math.sqrt(delta)) / (2*a) ;
            System.out.println("l'équation a deux solution : " );
            System.out.println("x1 = :" + x1 );
            System.out.println("x2 = :" + x2 );

        }
    }
}
