import java.util.Scanner;

public class BoucleWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Définition d'un code pin
        System.out.print("Veuillez définir un code PIN : ");
        int codePin = input.nextInt();

        // Trouver le code PIN
        int codePinTry = 0 ;
        while (codePinTry != codePin){
            System.out.print("Entrez un code PIN : ");
            codePinTry = input.nextInt();
            if(codePinTry != codePin){
                System.out.println("Code PIN errone , veuillez reessayer.");
            }else{
                System.out.println("Code Bon ");
            }
        }



    }

}
