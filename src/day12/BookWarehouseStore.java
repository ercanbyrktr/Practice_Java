package day12;

public class BookWarehouseStore {
static String bookStoreName;
String bookName;
String bookAuthor;
String bookColor;
boolean isHardCover;
int bookEdition;
int bookPublishYear;
double bookPrice;


public int age(){
    return 2023-bookPublishYear;
}

public void changeToColor(String newColor){
    bookColor=newColor;
}
public String bookAllInfo(){
    return "The Book details like below\n Book Name: "+bookName+"Book Author: "+bookAuthor+
            "\nBook Color: "+bookColor+"\n Book has hard cover: "+isHardCover+
            "\n Book Edition: "+bookEdition+"\nBook publish Year: "+bookPublishYear+"\nBook Price: "
            +bookPrice;
}

    public static void main(String[] args) {


    }
}
