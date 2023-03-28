package day08;

public class C02_loop2 {
    public static void main(String[] args) {
        //sum all number between 1 to 10
        //1+2+3+4+5+6+7+8+9+10=55
        int total=0;
        for (int i = 1; i <11 ; i++) {

              total +=i;
        }
        System.out.println("Sum number between 1-10="+total);
    }
}
