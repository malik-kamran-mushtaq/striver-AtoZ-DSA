package Stack;
import java.util.*;
public class MyStack{
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Kamran");
        stack.push("Owais");
        stack.push("Danish");
        stack.push("Baseer");
        System.out.println("Peek element is: "+stack.peek());
        stack.pop();
        System.out.println("Peek element is: "+stack.peek());
        stack.push("Rashid");
        stack.push("Mounis");
        // stack.pop("Mounis")    // cannot be done
        Iterator itr = stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}