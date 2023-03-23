package day04;

public class C02_Conditions2 {
    public static void main(String[] args) {
        /*
        write a program
        make a or name by alphabet letter
         */

        String name1,name2,name3;
        name1="Halil";name2="Arda";name3="Flora";
        System.out.println("(name1.compareTo(name2)"+(name1.compareTo(name2)));
        if (name1.compareTo(name2)>0&& name3.compareTo(name2)>0&& name3.compareTo(name1)>0){
            System.out.println("con1"+name2+"-"+name1+"-"+name2);
        } else if (name2.compareTo(name1)>0&& name3.compareTo(name1)>0&& name3.compareTo(name2)>0) {
            System.out.println("con2"+name1+"-"+name2+"-"+name3);

        }else if (name2.compareTo(name3)>0&& name2.compareTo(name1)>0&& name1.compareTo(name3)>0) {
            System.out.println("con3"+name3 + "-" + name2 + "-" + name1);
        }else{
            System.out.println("last one"+name1+"-"+name2+"-"+name3);
        }
    }
}
