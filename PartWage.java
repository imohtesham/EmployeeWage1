import java.util.Random;
import java.util.Scanner;

public class PartWage {
    public static void main(String[] args) {

        int isPartTime =1 ;
        int is_fulltimehrs = 2;
        int empHrsPERRate = 20;

        int empHrs = 0;
        int empwage = 0;
        double empcheck = Math.floor(Math.random() * 10) % 3;
        if (empcheck == is_fulltimehrs )
            empHrs =8;
        else if (empcheck == isPartTime)
            empHrs = 4;
        empwage = empHrs * empHrsPERRate;
        System.out.println("Emp wage :" + empwage);

    }



}
