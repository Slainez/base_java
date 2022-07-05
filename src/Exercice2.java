public class Exercice2 {

    public static void main(String[] args) {
        int a = 51 ;
        int b = 876 ;
        int c = 235 ;

        int j = a ;
        a = c ;
        c = j ;


        j = c ;
        c = b ;
        b = j ;


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

}
