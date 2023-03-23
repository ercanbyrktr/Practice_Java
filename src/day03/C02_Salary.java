package day03;

import java.util.Scanner;

public class C02_Salary {
    public static void main(String[] args) {
        /**
         * write a program calculate yearly salary base on hourly wage
         *  ask to user hourly wage
         *  print out yearly salary
         *  hourlyWage = 15
         *  yearlySalary = 15 x 8.5 X 5 X 4 X 12
         *
         */
        double dailyHour, days, weeks, yearly;
        double minWage, yearlySalary;
        dailyHour = 8.5;
        days = 5;
        weeks = 4;
        yearly = 12;

        System.out.println("hey what is your hourly wage income ?");
        Scanner hour = new Scanner(System.in);
        minWage = hour.nextDouble();
        yearlySalary = minWage * dailyHour *days* weeks * yearly;
        System.out.println(yearlySalary);
    }
}
