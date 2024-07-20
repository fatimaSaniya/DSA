package Stacks;
import java.util.Stack;
public class NextGreaterElement {
    public static int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] output = new int[n];
        output[n-1] = -1;

        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        for(int i = n-2;i>=0;i--){
            while(!st.isEmpty() && st.peek() <= arr[i]) st.pop();
            output[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        return output;
    }
    public static void main(String[] args) {
        int []arr = {1, 2, 13, 8, 9};
        arr = nextGreaterElements(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
