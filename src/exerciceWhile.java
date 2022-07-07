import java.util.Scanner;

public class exerciceWhile {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        Fixer le nombre de caractères à 4
//        Demander à l'utilisateur de reessayer tant que le code PIN ne contient pas
//        exactement 4 chiffres

//        Définition du code PIN
        int codePIN = 0 ;
        int longueur = 0 ;
        while(longueur < 4){
            System.out.print("Veuillez définir un code PIN : ");
             codePIN=input.nextInt();
             longueur = (int) Math.log1p(codePIN) ;
        }


//        Essayer de deverouiller le téléphone avec un code PIN
        int codePINATester;

//        Limiter le nombre de tentatives à 3.Mais ne pas utiliser une boucle for
        int compteur = 0 ;
        while (true){
            System.out.print("Entrer un code PIN pour déverouiller l'appareil " +
                    ": ");
            codePINATester=input.nextInt();//1234
            compteur ++ ;
            if (compteur == 3 ){
                break ;
            }

            if(codePINATester==codePIN){
                System.out.println("**************************");
                System.out.println("** Appareil déverouillé **");
                System.out.println("**************************");
                break;
            }
            System.out.println("Code PIN Erroné.Veuillez reessayer");
        }
    }
}
