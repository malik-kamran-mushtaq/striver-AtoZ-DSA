package LinkeList;
import java.util.*;
public class MyLinkedList {
    public static void main (String[] args) {
        LinkedList<String> li = new LinkedList<String>();
        li.add("Aamir");
        li.add("Aaqib");
        li.add("Junaid");
        li.add("Aamir");

        Iterator<String> itr = li.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}