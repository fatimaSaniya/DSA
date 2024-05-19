package Arrays;

import java.util.Scanner;

public class KthLargestAndSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {7,10,4,3,20,15};
        int k;
        int n= arr.length;
        System.out.println("Enter k value");
        k= sc.nextInt();
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                int temp;
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int j : arr) {
            System.out.print(" " + j);
        }
        System.out.println(3);
        System.out.println(k+ "th smallest element is: "+arr[k-1]);
        System.out.println(k+ "th largest element is: "+arr[n-k]);
    }
}
