// convert Array to List
package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrayList2 {
    public static void main(String[] args) {
        String arr[] = {"mango", "banana", "pineapple", "kiwi"};
        System.out.println("Printing the given array: "+Arrays.toString(arr));

        List<String> list = new ArrayList<String>();
        for(String fruits : arr) {
            list.add(fruits);
        }
        System.out.println("After conversion to list: "+list);
    }
}