package Naresh_IT;

import java.util.Scanner;

class Product{
    protected String name;
    protected double price;
    public Product(String name , double price){
        this.name = name;
        this.price = price;
    }
    public void displayInfo(){
        System.out.println(name);
        System.out.println(price);
    }
    public double calculateTotalCost(int quantity){
        return  price * quantity;
    }
}
class Electronics extends Product{
    private String brand;
    public Electronics(String name , double price ,String brand){
        super(name , price);
        this.brand = brand;
    }
    public void displayInfo(){
        System.out.println("Brand: " + brand);
    }
}
class Clothing extends Product{
    private String Size;
    public Clothing(String name , double price , String Size){
        super(name, price);
        this.Size = Size;
    }
    public void displayInfo(){
        System.out.println(Size);
    }
}
public class ShoppingOnline {
    public static void main(String []args){
        Scanner Details = new Scanner(System.in);
        System.out.println("Please Enter the Product: ");
        String name = Details.nextLine();
        System.out.println("Please Enter the Product Price: ");
        double price = Details.nextDouble();
        System.out.println("Please Enter the Quantity: ");
        int quantity = Details.nextInt();
        Details.nextLine();
        System.out.println("Please Enter the Product Brand: ");
        String brand = Details.nextLine();
        System.out.println("Electronic Details: ");
        Electronics Ele = new Electronics(name, price, brand );
        Product Pro = new Product(name, price);
        Pro.displayInfo();
        Double sum = Pro.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " units: " + sum);   
        Ele.displayInfo();
        System.out.println("Clothings Details: ");
        Clothing Clot = new Clothing(name, price, brand );
        Pro.displayInfo();
        Double sum2 = Pro.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " units: " + sum2);   
    };
        
        
}
