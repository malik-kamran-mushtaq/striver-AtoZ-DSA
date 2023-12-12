import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Kamran");
        map.put(2, "Danish");
        map.put(3, "Turab");
        map.put(4, "Shahid");

        // Non-generic(old style)
        // Set set = map.entrySet();
        // Iterator itr = (Iterator) set.iterator();
        // while (itr.hasnext()) {
        // Map.Entry entry = (Map.Entry)itr.next();
        // System.out.println(entry.getKey()+" "+entry.getValue());
        // }

        // Generic (new style)
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("comparing by key");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        System.out.println("comparing by key in descending order");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);


        System.out.println("comparing by value");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

        System.out.println("comparing by value in descending order");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);

    }
}
