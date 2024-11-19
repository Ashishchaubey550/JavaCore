package Collection_Work;

import java.util.LinkedList;

public class linkedList1 {
    public static void main(String[]args){
        LinkedList All = new LinkedList();
        All.add(100);
        All.add(200);
        All.add(300);
        All.add(400);
        System.out.println(All);
        All.addFirst("Ashish");
        All.addLast("Chaubey");
        System.out.println(All);
        System.out.println(All.peek());
        System.out.println(All.poll());
        System.out.println(All);

        All.push("555");
        System.out.println(All);
        System.out.println(All.pop());
        System.out.println(All);
    }
}
