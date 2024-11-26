package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;
public class StreamApiHai {
    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(8);
        list.add(10);
        list.add(2);
        list.add(9);
        list.add(35);
        Stream<Integer> streamData=list.stream();
        // Stream<Integer> sotedStream = streamData.sorted();
        // Stream<Integer> mapStream = sotedStream.map(n->n*9);
        // mapStream.forEach(n->System.out.println(n));
        Stream<Integer> finalStream=streamData.filter(n->n%2==0).sorted().map(n->n*2);
        finalStream.forEach(n->System.out.println(n));
    }
}
