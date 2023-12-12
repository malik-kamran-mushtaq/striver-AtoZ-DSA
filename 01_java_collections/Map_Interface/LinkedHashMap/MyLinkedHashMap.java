import java.util.LinkedHashMap;
import java.util.Map;

public class MyLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(10, "Nihal");
        map.put(11, "Arsalan");
        map.put(12, "Yahya");

        for(Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("\nFew more operation:");
        System.out.println("Keys are: "+map.keySet());
        System.out.println("Values: "+map.values());
        System.out.println("Key-value pairs: "+map.entrySet());
    }
    
}
