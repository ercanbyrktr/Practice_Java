package day03;

import java.util.Scanner;

public class C03_ConvertFahrenheit {
    public static void main(String[] args) {

        //write a program conver celcius to Fahrenheit
        //user enter a celcius number
        //result be like Fahrenheit
        //(0 C*9/5) + 32=32 F

        System.out.println("Hi!, What is temparature in your country?");
        double temp, fah;

        Scanner scan=new Scanner(System.in);
        temp=scan.nextDouble();
        fah=(temp+32)*5/9;
        System.out.println("Your temperature is : "+fah);


    }
}
