package Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7};
        int n1 = arr1.length;
        int arr2[] = {2, 4, 6, 8};
        int n2 = arr2.length;
        int arr3[] = new int[n1 + n2];
        arr3 = mergeArrays(arr1, arr2, n1, n2, arr3);
        System.out.print("Array: ");
        for (int i = 0; i < n1 + n2; i++)
            System.out.print(arr3[i] + " ");
    }
    public static int[] mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n1) arr3[k++] = arr1[i++];
        while (j < n2) arr3[k++] = arr2[j++];
        arr3 = Sort(arr3);
        return arr3;
    }
    public static int[] Sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}