package day14;

public class IsDigit {
    public static void main(String[] args) {

        String edition =" Programming with this updated guide with the latest features, 2nd Edition";
        String str ="";
        for (int i = 0; i <edition.length() ; i++) {
            str += edition.charAt(i);
            System.out.println(Character.isDigit(str.charAt(i)));
        }
    }
}
