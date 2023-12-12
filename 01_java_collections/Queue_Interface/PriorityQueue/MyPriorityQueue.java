package PriorityQueue;
import java.util.*;
public class MyPriorityQueue {
    public static void main(String[] args){
        PriorityQueue<String> q = new PriorityQueue<String>();
        q.add("Waseem");
        q.add("Turab");
        q.add("Zehan");
        q.add("Danish");
        q.add("Burhan");

        System.out.println("Head element: "+q.element());  //automatically takes the priority of alphabetical orer
        System.out.println("Head element: "+q.peek());

        System.out.println("First Iterator::");
        Iterator itr = q.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        q.remove();
        q.poll();

        System.out.println("After Removing::");
        Iterator itr2 = q.iterator();
        while(itr2.hasNext()) {
            System.out.println(itr2.next());
        } 
    }
}