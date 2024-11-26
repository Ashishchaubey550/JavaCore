package Naresh_IT;

abstract class Bank{
    protected String bankName;
    protected String  branchName;
    public static  int ifsCode;
    public Bank(String bankName , String branchName){
        this.bankName = bankName;
        this.branchName = branchName;
    }
    abstract double withdrawal(double amount);
    abstract double deposite(double amount);
    abstract double transfer(double amount, BankAccount fromAccount, BankAccount toAccount);
    abstract double loan(double amount, int years);

}

class Axis extends Bank {
    private double interestRate;
    public Axis(String bankName ,String branchName, double interestRate){
        super(bankName, branchName);
        this.interestRate = interestRate;
    }
    @Override
    double withdrawal(double amount){
        if (amount > 0) {
            System.out.println("Process With Withdrawal");
            return amount;
        }else {
            System.out.println("Enter Valid number please");
            return 0.0;
        }
    }
    @Override
    double deposite(double amount){
        if (amount > 0) {
            System.out.println("Process With Withdrawal");
            return amount;
        }else {
            System.out.println("Enter Valid number please");
            return 0.0;
        }
    }
    @Override
    double transfer(double amount, BankAccount fromAccount, BankAccount toAccount){
        if (amount > 0 && fromAccount>balance){
            System.out.println("Process With Withdrawal");
            return amount + (amount * interestRate * year /100);
        }else {
            System.out.println("Enter Valid number please");
            return 0.0;
        }
    }
    @Override
    double loan(double amount, int years){
        if (loanLimit > 0){
            System.out.println("Process With Withdrawal");
            return amount + (amount * interestRate * year /100);
        }else {
            System.out.println("Enter Valid number please");
            return 0.0;
        }
    }

}

class ICICI extends Bank{
    private double loanLimit;
    public ICICI(String bankName ,String branchName, double loanLimit){
        super(bankName, branchName);
        this.loanLimit = loanLimit;
    }
    @Override
    double withdrawal(double amount){
        if (amount > 0) {
            System.out.println("Process With Withdrawal");
            return amount;
        }else {
            System.out.println("Enter Valid number please");
            return 0.0;
        }
    }
    @Override
    double deposite(double amount){
        if (amount > 0) {
            System.out.println("Process With Withdrawal");
            return amount;
        }else {
            System.out.println("Enter Valid number please");
            return 0.0;
        }
    }
    @Override
    double transfer(double amount, BankAccount fromAccount, BankAccount toAccount){
        if (amount > 0 && fromAccount>balance){
            System.out.println("Process With Withdrawal");
            return amount + (amount * interestRate * year /100);
        }else {
            System.out.println("Enter Valid number please");
            return 0.0;
        }
    }
    @Override
    double loan(double amount, int years){
        if (loanLimit > 0){
            System.out.println("Process With Withdrawal");
            return amount + (amount * interestRate * year /100);
        }else {
            System.out.println("Enter Valid number please");
            return 0.0;
        }
    }
}

class SBI extends Bank{
    private double minimumBalance;
    public  SBI(String bankName , String branchName , double minimumBalance){
        super(bankName, branchName);
        this.minimumBalance = minimumBalance;
    }
    @Override
    double withdrawal(double amount){
        if (amount > 0) {
            System.out.println("Process With Withdrawal");
            return amount;
        }else {
            System.out.println("Enter Valid number please");
            return 0.0;
        }
    }
    @Override
    double deposite(double amount){
        if (amount > 0) {
            System.out.println("Process With Withdrawal");
            return amount;
        }else {
            System.out.println("Enter Valid number please");
            return 0.0;
        }
    }
    @Override
    double transfer(double amount, BankAccount fromAccount, BankAccount toAccount){
        if (amount > 0 && fromAccount>balance){
            System.out.println("Process With Withdrawal");
            return amount + (amount * interestRate * year /100);
        }else {
            System.out.println("Enter Valid number please");
            return 0.0;
        }
    }
    @Override
    double loan(double amount, int years){
        if (loanLimit > 0){
            System.out.println("Process With Withdrawal");
            return amount + (amount * interestRate * year /100);
        }else {
            System.out.println("Enter Valid number please");
            return 0.0;
        }
    }
}

class Customer{
    private int customerId;
    private String name;
    private String address;
    private String phoneNumber;
    private BankAccount bankAccount;
    public Customer(int customerId ,String name , String address , String phoneNumber , BankAccount bankAccount){
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.bankAccount = bankAccount;
    }
    public void (Bank bank , double initialDeposit){
        System.out.println("Open bank Account and Initliation the deposite");
    }

}

public class Banking_System{
    public static void main(String[]args){
        System.out.println("Hello Ashish");
    }
}