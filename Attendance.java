import java.util.Random;

public class Attendance {
    public static void main(String[] args) {

         int employePresent = 5;

        Random random = new Random();

            int empCheck = random.nextInt();


            if (employePresent == empCheck){

                System.out.println( "Employe is present");}

            else{
                System.out.println(("Employe is absent"));
            }
    }
}
