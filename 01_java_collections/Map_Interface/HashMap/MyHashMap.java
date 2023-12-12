import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Kamran");
        map.put(2, "Danish");
        map.put(3, "Turab");
        map.put(4, "Shahid");
        map.put(1, "Shahid");   // can't duplicate

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        map.putIfAbsent(5, "Yahya");
        System.out.println("adding 1...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
    
}
