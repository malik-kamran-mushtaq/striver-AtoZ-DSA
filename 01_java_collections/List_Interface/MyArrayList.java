import java.util.*;
public class MyArrayList{
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Kamran");
        arr.add("Owais");
        arr.add("Danish");
        arr.add("Baseer");

        Iterator itr = arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}