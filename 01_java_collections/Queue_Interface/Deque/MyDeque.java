package Deque;
import java.util.*;
public class MyDeque {
    public static void main(String[] args){
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Kamran");
        deque.add("Owais");
        deque.add("Shahid");
        deque.add("Owais");
        deque.add("Yahya");
        deque.addFirst("Danish");
        deque.addLast("Basit");

        for(String str : deque) {
            System.out.println(str);
        }

        System.out.println("After Removing: ");
        deque.removeFirst();
        deque.removeLast();

        for(String str : deque) {
            System.out.println(str);
        }
    }
}