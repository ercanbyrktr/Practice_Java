package day03;

import java.util.Scanner;

public class C04_CapitalLetter {
    public static void main(String[] args) {
        /*
        *write a program convert character lower case tı uppercase
        * user enter a char like :a
        * result should be like : A
        * dont user the string method char.toUpperCase();
        *
         */
        String lowerLetter;
        char upperLetter;

        System.out.println("Enter the your letter : ");
        Scanner temp=new Scanner(System.in);
        lowerLetter=temp.nextLine();

        upperLetter=(char)(lowerLetter.charAt(0)-32);

        System.out.println(upperLetter);
    }
}
