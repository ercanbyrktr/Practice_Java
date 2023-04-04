package day10;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        /**
         *          1
         *        1 2
         *      1 2 3
         *    1 2 3 4
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++)
        {
            for (int num = n - i; num > 0; num--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}