package Arrays;

import java.util.Scanner;

public class RotationArray1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rotation");
        int rotate = sc.nextInt();
        int []arr = {1,2,3,4,5,6,7,8,9};
        int n= arr.length;
        for (int i = 0; i < rotate; i++) {
            int temp = arr[n-1];
            for (int j=n-1; j>0 ; j--) {
                arr[j] =arr[j-1];
            }
            arr[0] = temp;
        }
        for (int i = 0; i <n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
