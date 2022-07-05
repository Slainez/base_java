
import java.util.Calendar;
import java.util.Scanner;


public class Age {
    public static void main(String[] args) {
        Scanner userAge = new Scanner(System.in);

        System.out.println("Quel est votre age ?");
        int age = userAge.nextInt();
        int yearCurrent = Calendar.getInstance().get(Calendar.YEAR);
        int dateOfBirth = yearCurrent - age ;
        System.out.println(dateOfBirth);
    }
}
