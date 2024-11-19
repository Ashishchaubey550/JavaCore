package Naresh_IT;
class LibraryItem{
    private String title;
    LibraryItem(String title){
        this.title = title;
    }
    public void displayInfo(){
        System.out.println(title);
    }
}
class Book extends LibraryItem{
    private String author;
    Book (String author){
        this.author = author;
    }
    super.title;  
    super.displayInfo();

}


public class LibraryMang {
    public static void main(String[]args){
        System.out.println("Hello World");
    }
}
