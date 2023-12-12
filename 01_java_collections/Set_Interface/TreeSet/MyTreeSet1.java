package TreeSet;

import java.util.TreeSet;

public class MyTreeSet1 {
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<String>();
        t.add("A");
        t.add("B");
        t.add("C");
        t.add("D");
        t.add("E");
        t.add("F");

        System.out.println("Descending order: "+t.descendingSet());
        System.out.println("Heas set: "+t.headSet("C"));
        System.out.println("Tail Set: "+t.tailSet("D"));
        System.out.println("Subset: "+t.subSet("B", "E"));
    }
}