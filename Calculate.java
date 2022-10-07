import java.util.Random;
import java.util.Scanner;

public class Calculate {
    public static final int isPartTime = 1;
    public static final int is_fulltimehrs = 2;
    public static final int empHrsPERRate = 20;
    public static final int NUMofWorkindays = 2;
    public static final int maxHrsINMonth = 10;

    public static void main(String[] args) {

        int empHrs = 0;
        int empwage = 0;
        int TotalempWage = 0;
        int totalWorkingday = 0;
        int TotalempHrs =0;

        while (TotalempHrs <= maxHrsINMonth &&
                totalWorkingday < NUMofWorkindays){
            totalWorkingday++;
            int empcheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empcheck) {
                case is_fulltimehrs:
                    empHrs = 8;
                    break;
                case isPartTime:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
                    break;
            }
            TotalempHrs += empHrs;
            empwage = empHrs * empHrsPERRate;
            TotalempWage+=empwage;
            System.out.println("Emp wage :" + empwage);
        }
        System.out.println("Total Emp  Wage :" + TotalempWage);
    }
}
