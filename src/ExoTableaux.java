public class ExoTableaux {
    public static void main(String[] args) {
        // Exercice 13
       // Ecrire un programme Java qui permet à l’utilisateur de déclarer 3 array d’entiers.Ces tableaux ne doivent pas forcément a
        //voir la même tailleLe programme doit ensuite fournir afficher les 3 tableaux en format [element1, element2,...,elementN]
        // et la somme de tous les éléments multiples 3 dans les 3 tableaux.
        int [] tab1 = {2, 6, 8, 15,39,11};
        int [] tab2 = { 21, 33, 12, 19,0 };
        int [] tab3 = {17, 18, 46};
        int [] tabMultiple3 = new int [tab1.length + tab2.length + tab3.length] ;
        int index = 0 ;
        int finalSum = 0 ;

        for (int nombre:tab1) {
            if(nombre % 3 == 0){
                tabMultiple3[index] = nombre;
                index++;
            }
        }
        for (int nombre:tab2) {
            if(nombre % 3 == 0){
                tabMultiple3[index] = nombre;
                index++;
            }
        }
        for (int nombre:tab3) {
            if(nombre % 3 == 0){
                tabMultiple3[index] = nombre;
                index++;
            }
        }


        System.out.print("S =");
        for (int nombre:tabMultiple3 ) {
           finalSum = finalSum + nombre ;
           if(nombre !=0){
               System.out.printf(" %d +",nombre);           }
        }
        System.out.println( " 0 = " + finalSum);
//      exercice 14


    }
}
