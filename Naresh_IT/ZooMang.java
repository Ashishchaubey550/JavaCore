package Naresh_IT;

import java.util.Scanner;

class Animal{
    private String Name;
    private int Age;
    public Animal(String Name , int Age){
        this.Name = Name;
        this.Age = Age;
    }
    public void makeSound(){
        System.out.println("The animal makes a generic sound.");
    }
    public void displayInfo(){
        System.out.println(Name);
        System.out.println(Age);
    }
}
class Lion extends Animal{
    private int maneLength;
    public Lion(String Name , int Age , int maneLength){
        super(Name, Age);
        this.maneLength = maneLength;
    }
    public void makeSound(){
        System.out.println("The lion roars loudly");
    }
    public void displayManeLength(){
        System.out.println(maneLength);
    }
}
class Elephant extends Animal{
    private float tuskLength;
    public Elephant(String Name, int Age, double tuskLength ){
            super(Name, Age);
            this.tuskLength = (float) tuskLength;
    }
    public void makeSound(){
        System.out.println("The elephant trumpets");
    } 
    public void displayTuskLength(){
        System.out.println(tuskLength);
    }
}
public class ZooMang {
    public static void main(String[]args){
        Scanner Details = new Scanner(System.in);
        System.out.println("Please Enter name of line");
        String Name = Details.nextLine();
        System.out.println("Please Enter age of line");
        int Age = Details.nextInt();
        System.out.println("Please Enter Length of manelenght of line");
        int maneLength = Details.nextInt();
        Details.nextLine();
        System.out.println("Please Enter name of Elephant");
        String EleName = Details.nextLine();
        System.out.println("Please Enter name of age");
        int age = Details.nextInt();
        System.out.println("Please Enter length of tusklength");
        float tuskLength = Details.nextFloat();
        if (Age ==0  || age == 0 || tuskLength == 0|| maneLength == 0) {
            System.out.println("Invalid Input");
        }else {
            System.out.print(
                "Details of Lion : \n"
            );
            Lion Li = new Lion(Name, Age, maneLength);
            Li.displayInfo();
            Li.makeSound();
            Li.displayManeLength();
            System.out.print("Details of Elephant: \n");
            Elephant Ele = new Elephant(EleName, age, tuskLength);
            Ele.displayInfo();
            Ele.displayTuskLength();
        }
        Details.close();
    }    
}
