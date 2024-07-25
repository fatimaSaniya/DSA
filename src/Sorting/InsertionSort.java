package Sorting;
public class InsertionSort {
    // Stable Sort - relative order is maintain
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 21, 1};
        int n = arr.length;
        print(arr);
        //Insertion sort for loop only
        for (int i = 1; i < n; i++) {
            for (int j = i; j >= 1 && arr[j] < arr[j - 1]; j--) {
               swap(arr, j, j - 1);
            }
        }
        print(arr);
        //Insertion sort while loop
        for (int i = 1; i < n; i++) {
            int j = i;
            while(j>=1 && arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                j--;
            }
        }
        print(arr);
    }
}
