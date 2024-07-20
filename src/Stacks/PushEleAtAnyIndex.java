package Stacks;

import java.util.Stack;

public class PushEleAtAnyIndex {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        System.out.println("Original: " +st1);
        int k = 1;
        Stack<Integer> st2 = new Stack<>();
        while(st1.size()>k) st2.push(st1.pop());
        st1.push(50);
        while(!st2.isEmpty()) st1.push(st2.pop());
        System.out.println("After updation: " + st1);
    }
}
