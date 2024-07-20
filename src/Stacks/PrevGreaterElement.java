package Stacks;

import java.util.Stack;

public class PrevGreaterElement {
    public static int[] PrevGreaterElements(int[] arr) {
        int n = arr.length;
        int[] output = new int[n];
        output[0] = -1;

        java.util.Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek() <= arr[i]) st.pop();
            output[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        return output;
    }
    public static void main(String[] args) {
        int []arr = {5, 2, 13, 8, 9};
        arr = PrevGreaterElements(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
