package day10;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int fact=1;
        for (int i = number; i >1 ; i--) {
            fact=fact*i;
            if (i==1)
                System.out.println(i);
            else
             System.out.println(i+"x");

        }
        System.out.println(" = "+fact);
    }
}
