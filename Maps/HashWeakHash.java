package Maps;

import java.util.HashMap;

class Employ{
    private String name;
    private int empID;
    Employ(String name , int empID){
        this.name = name;
        this.empID = empID;
    }
    public String toString(){
        return empID + "";
    }
    @Override
    public void finalize(){
        System.out.println("Clean Up work by GC before De alocating memory from the heap");
    }
}

public class HashWeakHash {
    public static void main(String [] args){
        Employ Em = new Employ("Ashish", 45);
        HashMap hm = new HashMap<>();
        hm.put(Em, "Ashish");
        System.out.println(hm);
        Em = null;
        System.gc();
        System.out.println(hm);
        System.out.println("Last Line");
    }
}
