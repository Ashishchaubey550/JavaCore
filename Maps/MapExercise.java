package Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Students
{
    private String Name;
    private int Age;
    private String city;
    public Students(String Name , int Age , String city){
        this.Name = Name;
        this.Age = Age;
        this.city = city;
        
    }
    public String getName(){
        return Name;
    }
    public int getAge(){
        return Age;
    }
    public String getciyt(){
        return city;
    }
    public String toString(){
        return Name + " " + Age + " " + city;
    }

}

public class MapExercise {
    public static void main(String[]args){
        Students st1 = new Students("Ashish", 20, "Raipur");
        Students st2 = new Students("Prabhat", 18, "Gorakhpur");
        Students st3 = new Students("Chirag", 25, "Patna");
        Map map = new HashMap<>();
        map.put(1, st1);
        map.put(2, st2);
        map.put(3, st3);
        System.out.println(map);

        //==============Access Key ==========
        System.out.println("Fetching only Keys \n");
        Set keys=map.keySet();
        Iterator st=keys.iterator();
        while (st.hasNext()){
            System.out.println(st.next());
        }

        //======================Access Only Values===============
        System.out.println("Fetching only Values \n");
        Collection val=map.values();
        Iterator str2=val.iterator();
        while (str2.hasNext()) {
            System.out.println(str2.next());
        }

        //========================Access whole Data=============
        System.out.println("Fetching Whole Data \n");
        Set data=map.entrySet();
        Iterator str3=data.iterator();
        while (str3.hasNext()) {
            System.out.println(str3.next());
        }
    }
}
