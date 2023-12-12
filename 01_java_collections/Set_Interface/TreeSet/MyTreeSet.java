package TreeSet;
import java.util.*;

public class MyTreeSet {
    public static void main(String args[]) {
        TreeSet<String> tree = new TreeSet<String>();
        tree.add("Rabia");
        tree.add("Mustabshira");
        tree.add("Faheem");
        tree.add("Iram");
        tree.add("Faizan");
        tree.add("Uzma");

        Iterator itr = tree.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}