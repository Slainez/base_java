public class Datatypes {
    public static void main(String[] args) {
//      Chaîne de caractères
        String prenom = "Sullyvan";
        String nom = "LAINEZ";
        String nomComplet = prenom + " " + nom;

//    Caractères
    char genre = 'M';


//   Réels
    float poids = 75.5F;
    float tjm = 8.5F;

//   Réels double precision

    double    pi = 3.7682526655225565;

//      Byte : variante d'entier court
    byte age = 26 ;


    System.out.println("Je suis "+ prenom + " " + nom + ",j'ai " + age +" ans.Mon tjm est de " + tjm + " euros");
    System.out.printf("je suis %s %s,j'ai %d ans.\nMon TJM est de %.1f €",prenom,nom,age,tjm);
    }
}
