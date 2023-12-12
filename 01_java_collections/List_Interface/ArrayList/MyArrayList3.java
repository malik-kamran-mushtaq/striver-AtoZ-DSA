package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrayList3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("messi");
        list.add("gavi");
        list.add("pedri");
        list.add("iniesta");

        String array[] = new String[list.size()];
        list.toArray(array);
        System.out.println("Printing array: "+Arrays.toString(array));

        System.out.println("List is: "+list);

        
    }
}
