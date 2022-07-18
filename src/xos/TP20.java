package xos;
public class TP20 {

    static String  formatString(String chaine, int tailleChaine2 ){
       String  formattedString = chaine.substring(0,tailleChaine2 );
        return formattedString ;
    };

    static boolean isPrefix(String chaineFormate1 , String chaine2){
        boolean isPrefix = true ;
          for(int i=0 ; i <= chaine2.length()-1 ; i++){
             if(chaineFormate1.charAt(i) != chaine2.charAt(i)){
               isPrefix = false ;
             }
          }
      return isPrefix ;
    }
    static boolean arePrefixedTreatment(String chaine1 , String chaine2){
      String  chaineFormate = formatString(chaine1,chaine2.length());
      return isPrefix(chaineFormate,chaine2);
    }

    public static void main(String[] args) {
        System.out.println(arePrefixedTreatment("Abruti","Abr"));
        System.out.println(arePrefixedTreatment("papazou","afi"));

    }
}
