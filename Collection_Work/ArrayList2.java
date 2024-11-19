package Collection_Work;

import java.util.ArrayList;
public class ArrayList2 {
    public static void main(String[]args){
        ArrayList S3 = new ArrayList();
        S3.ensureCapacity(10);
        S3.add(100);
        S3.add(200);
        S3.add(300);
        S3.add(400);
        System.out.println(S3);
        boolean hold = S3.contains(20);
        int index = S3.indexOf(20) ;
        if(hold){
            System.out.println("Yes it is Present in Collection: " + index );
        }else {
            System.out.println("Sorry it is not present in Collection At index: " +  index );
        }
        S3.clear();
        System.out.println(S3);
        S3.clone();
    }
}
