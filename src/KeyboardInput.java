import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Votre nom : ");
        String nom=input.nextLine();

        System.out.print("Votre prenom : ");
        String prenom=input.nextLine();

        System.out.print("Votre age : ");
        byte age = input.nextByte();

        System.out.print("Votre poids :");
        float poids = input.nextFloat();

        System.out.printf("Nom : %s\nPrenom : %s\nAge : %d \nPoids : %.1f",nom,prenom,age,poids);



    }
}
