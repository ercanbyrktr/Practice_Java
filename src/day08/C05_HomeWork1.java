package day08;

public class C05_HomeWork1 {
    public static void main(String[] args) {
        /*
        Task
Write a program;
from 1-100  print out all the numbers can be divided by 15 without remainder
// from 1-100  count how many numbers can be divided by 15
hint;
 if    i%15==0
count =count+1
         */
       int count=0;
        for (int i = 1; i <=100 ; i++) {
            if (i%15==0){
                count+=i;

    }
}
        System.out.println("Sum of numbers 1-100 divisible by 15 without a remainder= "+count);
    }
}