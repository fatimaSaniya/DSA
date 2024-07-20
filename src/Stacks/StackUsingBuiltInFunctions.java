package Stacks;
import java.util.Stack;
public class StackUsingBuiltInFunctions {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        System.out.println("Original: " +st1);
//        System.out.println(st.peek());
//        System.out.print("Stack: ");

        //display
//        while(!st.isEmpty())
//            System.out.print(st.pop() + " ");

        //reverse stack
        Stack<Integer> st2 = new Stack<>();
        while(!st1.isEmpty()) st2.push(st1.pop());
        System.out.println("Reverse : " +st2);

        Stack<Integer> st3 = new Stack<>();
        while(!st2.isEmpty()) st3.push(st2.pop());
        System.out.println("Reverse : " +st3);
    }
}
