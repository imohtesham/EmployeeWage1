import java.util.Random;
import java.util.Scanner;

public class Wage {
    public static void main(String[] args) {
        int is_fulltimehrs = 1;
        int empHrsPERRate = 20;

        int empHrs = 0;
        int empwage = 0;
         double empcheck = Math.floor(Math.random() * 10) % 2;
         if (empcheck == is_fulltimehrs )
             empHrs =8;
         else
             empHrs=0;
         empwage = empHrs * empHrsPERRate;
         System.out.println("Emp wage :" + empwage);

    }
}

