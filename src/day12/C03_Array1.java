package day12;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Array1 {
    public static void main(String[] args) {

        String teacherName="Kursad";

        int[] numbers={1,5,9,8,7,22};
        String[] name={"Ercan","Furkan","Halil","Asil","Emel","Serpil","Amr","Arda","Ensar","Abdurrahim"};

        //System.out.println(name.length);//for array
        //System.out.println(teacherName.length());//for string
        int[] num=new int[10];
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i <num.length ; i++) {
            System.out.println("enter an element to the array");
            num[i]=(int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(num));
    }
}
