package Naresh_IT;

import java.util.Scanner;

class Person{
        private String name = "Ashish";
        private int age = 21;
        public Person(String name , int age){
            this.name = name;
            this.age= age;
        }
        public void dispInfo(){
            System.out.println(name);
            System.out.println(age);
        }
}

class Employee extends Person{
    private String EmployeeId  = "8751dffghh";
    public Employee(String name , int age , String EmployeeId){
        super(name, age);
        this.EmployeeId = EmployeeId;
    }
    public void displayEmployeeInfo(){
        dispInfo();
        System.out.println(EmployeeId);
    }
}

class Manager extends Employee {
    private String department = "Java Developer";
    public Manager(String name , int age , String EmployeeId , String department){
        super(name, age, EmployeeId);
        this.department=department;
    }
    public void displayManagerInfo(){
        displayEmployeeInfo();
        System.out.println(department);
    }
}


public class EmployeMang{
    public static void main(String[]args){
        System.out.println("Please Enter Your Required Details");
        Scanner Details = new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        String name = Details.nextLine();
        System.out.println("Please Enter Your Age");
        int age = Details.nextInt();
        Details.nextLine();
        System.out.println("Please Enter Your EmployeeId");
        String EmployeeId = Details.nextLine();
        System.out.println("Please Enter Your Department ");
        String department = Details.nextLine();
        System.out.println("Your Employe Card is in Progress , Please Wait....");
        Manager Man = new Manager(name , age , EmployeeId , department);
        System.out.println("You Id Is Ready  Happy Coding");
        Man.displayManagerInfo();
        Details.close();
    }
}
