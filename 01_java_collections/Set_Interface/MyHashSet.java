import java.util.*;
public class MyHashSet {
    public static void main(String args[]){
        HashSet<String> set = new HashSet<String>();
        set.add("Rabia");
        set.add("Shabnum");
        set.add("Sadaqat");
        set.add("Iram");

        Iterator itr = set.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}