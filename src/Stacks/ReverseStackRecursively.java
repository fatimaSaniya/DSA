package Stacks;

import java.util.Stack;

public class ReverseStackRecursively {
    public static void displayReverse(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        //System.out.print(top+ " ");  //display reverse order
        displayReverse(st);
        System.out.print(top+ " "); //display exact order
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        displayReverse(st);
    }
}
