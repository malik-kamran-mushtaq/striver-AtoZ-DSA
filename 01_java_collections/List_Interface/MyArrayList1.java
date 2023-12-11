import java.util.*;
public class MyArrayList1 {
    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(99);
        arr.add(53);
        arr.add(13);
        arr.add(2);
        arr.add(15);

        System.out.println("Using Iterator:");
        Iterator itr = arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Using for loop: ");
        for(Integer i : arr) {
            System.out.println(i);
        }

        System.out.println("4th element is : "+arr.get(4));
        arr.set(2, 100);

        System.out.println("Using for-Each");
        arr.forEach(a -> {
            System.out.println(a);
        });

        System.out.println("Using listIterator: in reverse order:");
        ListIterator<Integer> li = arr.listIterator(arr.size());
        while(li.hasPrevious()) {
            System.out.println(li.previous());
        }

        System.out.println("After sorting: ");
         Collections.sort(arr);
         for(Integer i : arr) {
            System.out.print(i+" ");
         }
         System.out.println();
    }
}