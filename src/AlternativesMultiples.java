import java.util.Scanner;

public class AlternativesMultiples {
    public static void main(String[] args) {
//Demander d'entrer le nom d'un pays
// si nom du pays est "France" alors
// Affiche "Bonjour"
//Sinon so nom est "Espagne" alors
//On affiche "hola"
//Sinon si nom est "Allemagne" alors
// On affiche "Guten tag"
//Sinon si nom est "Angleterre"
// Afficher "Hello"
//Sinon
// Pays non reconnu

        Scanner input = new Scanner(System.in);
        System.out.println("Veuillez entrez un pays : ");
        String pays = input.nextLine();

        if(pays.equals("France")){
            System.out.println("Bonjour ! ");
        } else if (pays.equals("Espagne")) {
            System.out.println("Hola !");
        } else if (pays.equals("Allemagne")){
            System.out.println("Guten tag !");
        } else if (pays.equals("Angleterre")) {
            System.out.println("Hello !");
        }else{
            System.out.println("Pays non reconnu");
        }
// Utilisation de switch

        switch (pays){
            case "France":
                System.out.println("Bonjour");
                break;
            case "Espagne":
                System.out.println("Hola");
                break;
            case "Allemagne":
                System.out.println("Guten tag");
                break;
            case "Angleterre":
                System.out.println("Hello");
                break;
            default:
                System.out.println("Pays non reconnu");
        }

    }

}
