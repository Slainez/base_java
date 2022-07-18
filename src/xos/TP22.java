package xos;

public class TP22 {

    static boolean itIsIdentic(String chaine){
        boolean isIdentic = false ;
        for(int i = 0 ; i<= chaine.length()-1; i++){
            if(i != 0 && chaine.charAt(i) == chaine.charAt(i-1)){
                isIdentic = true ;
            }
        }
        return isIdentic ;
    }
    public static void main(String[] args) {
        System.out.println(itIsIdentic("cchats"));
    }
}
