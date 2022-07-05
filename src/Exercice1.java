import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Saissisez le diametre : ");

        double diametre = input.nextDouble();
        double rayon = diametre / 2 ;
        final double PI = Math.PI ;
        double surface = Math.pow(rayon,2) * PI ;

        System.out.println(surface);

    }
}
