class Student{
    private String name;
    private int age;
    private String city;
    public Student(String name , int age , String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }
    public String toString(){
        return "Name: " + name + " " + "Age: "+ age + " " + "City: " + city;
    }
}


public class FileHandleFundamental {
    public static void main(String[] args){
        System.out.println("File Handle");
        Student st = new Student("Ashish", 24, "Raipur");
        System.out.println(st);
    }
}