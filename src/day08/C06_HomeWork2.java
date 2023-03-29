package day08;

import java.util.Scanner;

public class C06_HomeWork2 {
    public static void main(String[] args) {
        /*
        Task
Write a program
String "Abdurrahim Asil, Arda Ercan Amr Yagiz Kursad Irfan Emel Serpil Furkan Halil Hava Burcu Ensar "
find out 'a'  how many showed the character in the String .
hint;
if ( currentChar =='a')
count++; (edited)
------------------------------------------------------
Görev
program yaz
"Abdurrahim Asil, Arda Ercan Amr Yağız Kürşad İrfan Emel Serpil Furkan Halil Hava Burcu Ensar "
'a' karakterinin String içinde kaç tanesinin gösterildiğini öğrenin.
ipucu;
eğer ( currentChar =='a')
sayı++; (düzenlendi)
         */


        String name="Abdurrahim Asil Arda Ercan Amr Yağız Kürşad İrfan Emel Serpil Furkan Halil Hava Burcu Ensar";
        int count=0;
        char currentChar='a';
        for (int i = 0; i <name.length() ; i++) {
            if (name.charAt(i)=='a'||name.charAt(i)=='A'){
                count++;
            }

        }
        System.out.println("a count = "+count);
    }
}
