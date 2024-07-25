package Recursion;

public class ArrayTraversal {
    public static void recursiveTraversal(int i, int[] arr){
        if(i>= arr.length) return;
        System.out.print(arr[i] + " ");
        recursiveTraversal(i+1, arr);
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,14,6,7,10};
        for (int ele: arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        recursiveTraversal(0,arr);
    }
}
