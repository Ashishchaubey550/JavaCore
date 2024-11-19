package Collection_Work;

import java.util.ArrayList;

public class index {
    public static void main(String[]args){
        ArrayList All = new ArrayList();
        All.add(100);
        All.add(200);
        All.add(300);
        All.add("Ashish");
        System.out.println(All);

        ArrayList All2 = new ArrayList();
        All2.add("Ashish");
        All2.add("A");
        All2.add(2);
        All2.add(2.3);
        System.out.println(All2);

        All.addAll(All2);
        System.out.println("After add All2 in All ================");
        System.out.println(All);
        System.out.println("Adding element in specific index");
        All.add(4, "Chaubey");
        System.out.println(All); 



        ArrayList S3 = new ArrayList();
        S3.add(2);
        S3.add("Ashish");
        S3.add(3);
        System.out.println(S3);
        System.out.println("Adding S3 collection in ALl \n");
        All.addAll(S3);
        System.out.println(All);
        System.out.println("Good");
    }
}
