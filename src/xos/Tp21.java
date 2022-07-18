package xos;

public class Tp21 {

    static String readingTab(int [][] tableau , int number){
        int countOccurence = 0 ;
        String finalResult = "";
       for(int i = 0 ; i <= tableau.length -1 ; i++){
           for(int j = 0 ; j <= tableau[i].length-1 ; j++){
               if(number == tableau[i][j]){
                   countOccurence ++ ;
                  finalResult += " (" + i + "," + j + ")" ;
               }
           }
       }
       finalResult = number + " se retrouve " + countOccurence + " fois dans les emplacement suivants " + finalResult;
       return finalResult;

    }
    public static void main(String[] args) {
        int [][] tab = {{1,4,2,1},{6,3,8,9},{1,5,1,0}};
        System.out.println(readingTab(tab,1));
    }
}
