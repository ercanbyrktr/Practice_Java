package day02;

import java.util.Scanner;

public class C04_Exercise {
    public static void main(String[] args) {
        /*
        fullName - age - height - myLastNameFirstInitial - myFirstNameFirstInitial - isMarried - childrenCount -
        city - gpaMark - desireSalary - isCitizen
        Write a program to print out the above information.
                ***you dont need to use real data.
                *** Pls send me privately
                ***you should use different data types as much as possible. (edited)

            fullName - yaş - boy - myLastNameFirstInitial - myFirstNameFirstInitial - isMarried
            - childrenCount - şehir - gpaMark - desireMaaş - isCitizen

                Yukarıdaki bilgileri yazdıran bir program yazınız.
            ***gerçek verileri kullanmanıza gerek yoktur.
            *** Lütfen bana özel olarak gönderin
            ***mümkün olduğunca farklı veri türleri kullanmalısınız. (düzenlendi)

       */


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name");
        String fullname = scan.nextLine();

        System.out.println("please enter your age");
        int age = scan.nextInt();

        System.out.println("please enter your height");
        double height = scan.nextDouble();

        System.out.println("please enter your myLastNameFirstInitial");
        char myLastNameFirstInitial = scan.next().charAt(0);

        System.out.println("Are you married");

        boolean married=scan.nextBoolean();

        System.out.println("please enter the number of children");
        int child = scan.nextInt();

        System.out.println("please enter the city you live in");
        String city = scan.next();

        System.out.println("please enter your desired salary");
        int salary = scan.nextInt();

        System.out.println("Please enter the city you want to live in");
        String isCitizen = scan.next();

        System.out.println("Your registration has been successfully completed");


        //1) c  and  e
        //2) b
        //3) a and d
        //4) a and c
    }
}
