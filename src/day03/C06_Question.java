package day03;

import java.util.Scanner;

public class C06_Question {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);


        System.out.println("whats the price of tomato");
        double tomatoPrice;
        double tomatoPrice1=scan.nextDouble();
        System.out.println("how many tomato you want to buy tomato");
        int tomato= scan.nextInt();

        System.out.println("whats the price of potato");
        double potatoPrice;
        double potatoPrice1=scan.nextDouble();
        System.out.println("how many tomato you want to buy potato");
        int potato= scan.nextInt();

        System.out.println("whats the price of banana");
        double bananaPrice;
        double bananaPrice1=scan.nextDouble();
        System.out.println("how many tomato you want to buy banana");
        int banana= scan.nextInt();

        System.out.println("Total : "+ (tomatoPrice1*tomato)+(potatoPrice1*potato)+(bananaPrice1*banana));
    }
}
  /*
        TAsk2: Grocery Shopping
    *   ask user whats the price of tomato and store it
        ask user how many tomato you want to buy and store it
    *   ask user whats the price of potato and store it
        ask user how many potato you want to buy and store it
    *   ask user whats the price of banana and store it
        ask user how many banana you want to buy and store it
        generate this example output
        You got 3 tomato price is 2.99 and total -->>
                You got 5 potato price is 3.49 and total -->>
                You got 2 banana price is 1.99 and total -->>
                Your grand total for this shopping is ????
    (edited)

    TAsk2: Market Alışverişi
     * Kullanıcıya domatesin fiyatını sorun ve saklayın
         kullanıcıya kaç tane domates almak istediğinizi sorun ve saklayın
     * kullanıcıya patatesin fiyatını sorun ve saklayın
         kullanıcıya ne kadar patates almak istediğinizi sorun ve saklayın
     * kullanıcıya muzun fiyatını sorun ve saklayın
         kullanıcıya kaç tane muz almak istediğini sor ve sakla
         bu örnek çıktıyı oluştur
         3 adet domatesiniz var fiyatı 2.99 ve toplam -->>
                 5 adet patatesiniz var fiyati 3.49 ve toplam -->>
                 2 muzun fiyatı 1,99 ve toplam -->>
                 Bu alışveriş için genel toplamınız ????
     (düzenlendi)

         */