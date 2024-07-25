package Sorting;

public class CheckArraySorted {
    public static void main(String[] args) {
        int []arr = {1,2,3,5,7,8,49,42};
        boolean flag = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]) {
                flag = false;
                break;
            }
        }
        if(flag) System.out.println("Sorted");
        else System.out.println("Not Sorted");
    }
}
