import java.util.Scanner;

public class DeuxiemeSerieExercicesBoucle {
    public static void main(String[] args) {

        // Exercice 7
//        Écrivez un programme Tables.java affichant les tables de multiplication de 2 à 10.

        for(int x = 1 ; x <= 10 ; x++){
            for(int i=1 ; i <= 10 ; i++) {
                int produit = x*i ;
                System.out.printf("%d X %d = %d \n",x,i,produit);
            }
        }
//        Exercice 8
//        Écrivez un programme Java qui demande à l’utilisateur d’entrer un nombre et qui ensuite va calculer et afficher la factorielle de ce nombre:






        //Exerice  11
//        Écrire un programme Java qui génère un nombre(entier) aléatoire entre 1 et 100 et qui ensuite demandera à l’utilisateur
//        de deviner le nombre jusqu’à ce que la réponse convienne.En cas de réponse supérieure à la valeur générée, le programme
//        affichera “Entrer un plus petit nombre”.En cas de valeur inférieur, le programme affichera “Entrer un plus grand nombre”.

        int minVal = 1 ;
        int maxVal = 100 ;
       double randomNumber = Math.random() * (maxVal - minVal);
        int randomIntNumber = (int) randomNumber;
        System.out.println(randomIntNumber);
        Scanner input = new Scanner(System.in);

        int tryNumber = 0 ;
        while(tryNumber != randomIntNumber){
            System.out.println("Entrez un nombre entre 1 et 100 :");
            tryNumber = input.nextInt() ;

            if(tryNumber < randomIntNumber){
                System.out.println("Le nombre est plus petit");
            } else if (tryNumber > randomIntNumber) {
                System.out.println("Le nombre est plus grand");
            }else{
                System.out.println("Bravo vous avez gagné ");
            }
        }
    }
}
