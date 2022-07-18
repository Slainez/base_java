package xos;

public class TP24 {

    static void hashtagForAll(int number){
        String finalString = "";
        String str = "#";
        for(int i = 0 ; i<= number-1 ; i++){
           finalString += str ;
          if (i!=number-1){
              System.out.println("'"  + finalString + " ' ");
          }else{
              System.out.println("'"  + finalString + "' ") ;
          }
        }
    }
    public static void main(String[] args) {
        hashtagForAll(10);
    }
}
