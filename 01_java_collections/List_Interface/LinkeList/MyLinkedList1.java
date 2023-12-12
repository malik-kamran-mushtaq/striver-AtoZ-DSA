package LinkeList;
import java.util.*;

public class MyLinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList<String>();
        li.add("Aamir");
        li.add("Aaqib");
        li.add("Junaid");
        li.add("Aamir");

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Umar");
        ll.add("Kaisar");
        ll.add("Ubaid");

        System.out.println("ll is: "+ll);

        li.addAll(ll);

        LinkedList<String> l2 = new LinkedList<String>();
        l2.add("Junaid");
        l2.add("Akeel");
        l2.add("Muneeb");

        System.out.println("l2 is: "+l2);

        li.addAll(2, l2);

        li.addFirst("Nihal");
        li.addLast("Arsalan");
        li.add(1, "Zehan");
        li.remove();
        li.removeFirst();
        li.removeLast();
        li.remove(3);

        li.removeFirstOccurrence("Aamir");

        System.out.println("Normal list...");
        Iterator<String> itr = li.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("List in descending...");
        Iterator i = li.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
