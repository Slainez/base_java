import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        int nombre = input.nextInt();

        if(nombre % 2 == 0 ){
            if (nombre > 0){
                System.out.println("Le nombre est pair et positif");
            } else if (nombre < 0) {
                System.out.println("Le nombre est pair et negatif");
            }else{
                System.out.println("Le nombre est 0");
            }

        }else {
            if (nombre > 0){
                System.out.println("Le nombre est impair et positif");
            } else if (nombre < 0) {
                System.out.println("Le nombre est impair et negatif");
            }else{
                System.out.println("Le nombre est 0");
            }
        }

    }
}
