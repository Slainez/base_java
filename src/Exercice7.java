import java.util.Scanner;

public class Exercice7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez un chiffre entre 1 et 12");
        byte nombre = input.nextByte();


            switch(nombre) {
                case 1 :
                    System.out.println("Mois 1 = Janvier");
                    break;
                case 2 :
                    System.out.println("Mois 2 = Février");
                    break;
                case 3 :
                    System.out.println("Mois 3 = Mars");
                    break;
                case 4 :
                    System.out.println("Mois 4 = Avril");
                    break;
                case 5 :
                    System.out.println("Mois 5 = Mai");
                    break;
                case 6 :
                    System.out.println("Mois 6 = Juin");
                    break;
                case 7 :
                    System.out.println("Mois 7 = Juillet");
                    break;
                case 8 :
                    System.out.println("Mois 8 = Aout");
                    break;
                case 9 :
                    System.out.println("Mois 9 = Septembre");
                    break;
                case 10 :
                    System.out.println("Mois 10 = Octobre");
                    break;
                case 11 :
                    System.out.println("Mois 11 = Novembre");
                    break;
                case 12 :
                    System.out.println("Mois 12 = Décembre");
                    break;
                default :
                    System.out.println("Votre mois vient d'une autre planète");
            }


    }
}
