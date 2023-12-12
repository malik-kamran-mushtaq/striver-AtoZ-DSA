import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tree = new TreeMap<Integer, String>();
        tree.put(100, "Basit");
        tree.put(101, "Aamir");
        tree.put(102, "Tanveer");

        for(Map.Entry m : tree.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
    
}
