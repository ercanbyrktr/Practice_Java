package day02;

public class C02_ExampleInteger {
    public static void main(String[] args) {
        int a, b, c, d, e;
        a = 10;
        b = 20;
        c = 30;
        d = 25;
        b = a;
        c = d;
        d = a;
        c = d;
        e = a + b + c + d;
        System.out.println("result is : " + e);
// ctlr + alt + L   -> reformatting method
    }
}
