package Maps;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map2 {
    public static void main(String[]args){
        Map map = new HashMap();
        map.put(1, "MS Dhoni");
        map.put(2, "Virat");
        map.put(3, "Rohit");
        map.put(4, "Rahul");
        System.out.println(map);
        System.out.println(map.get(3));

        //=====================================Accesses Only Keys

        Set keyset = map.keySet();
        Iterator itr = keyset.iterator();
        while(itr.hasNext()){
            Integer key =(Integer)itr.next();
            System.out.println(key+1); 
        }

        //====================================Accessing Only Values
        
        Collection values=map.values();
        Iterator itr2=values.iterator();
        while (itr2.hasNext()) {
            String val = (String)itr2.next();
            System.out.println(val + "Ashish");
        }

        //================================Access All data present in the Collection
        Set enty=map.entrySet();
        Iterator itr3=enty.iterator();
        while (itr3.hasNext()) {
            Map.Entry  = (Entry) itr3.next();
            System.out.println(data.getKey() + " " + data.getvalues);
        }
    }
}
