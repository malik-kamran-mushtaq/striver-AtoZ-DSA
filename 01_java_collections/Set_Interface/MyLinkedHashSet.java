import java.util.*;

public class MyLinkedHashSet {
    public static void main(String args[]) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("Rabia");
        set.add("Shabnum");
        set.add("Sadaqat");
        set.add("Iram");
        set.add("Mariya");
        set.add("Uzma");

        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}