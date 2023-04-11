package day12;

public class C04_Array3 {
    public static void main(String[] args) {

        String[] email={"furkan.camioglu@amazon.com"};
        int indexLength=email[0].length();
         System.out.println(indexLength);
         String str="";
         int x=0;
        while (email[0].length()>=0) {
            if (email[0].charAt(x) != '@')
                str += email[0].charAt(x);

            x++;
            indexLength--;

        }
        System.out.println(str);
    }
}
