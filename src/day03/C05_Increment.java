package day03;

public class C05_Increment {
    public static void main(String[] args) {
        /**
         * a = 10;
         * b = 10;
         * a++;  11
         * ++b;  11;
         * a--;  10
         * a+=5; 15
         *
         *
         * shift+F10 run the code
         */

        int a,b;
        a=10;
        b=10;

        System.out.println(++a); //11
        System.out.println(b++);//10
        System.out.println(b);//11

    }
}
