package Vector;
import java.util.*;
public class MyVector{
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("Kamran");
        v.add("Owais");
        v.add("Danish");
        v.add("Baseer");

        Iterator<String> itr = v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}