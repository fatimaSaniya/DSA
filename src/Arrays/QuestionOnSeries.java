package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class QuestionOnSeries {
    public static void main(String[] args) {
        int k = 5, sum = 0;
        int[] arr = new int[k];
        System.out.print("1 ");
        for (int i = 1; i < 5; i++) {
            int j = (int) Math.pow(i, (i + 1));
            arr[i] = j + i;
            arr[0] = 1;
            System.out.print(j + " ");
            if (j % 2 == 0) {
                sum = sum + j;
            }
        }
        System.out.println();
        System.out.println(sum);
        for (int i = 0; i < k; i++) {
            System.out.println(arr[i]);
        }
        int  sum2 = 0;
        for (int j = 1; j < arr[k-1]; j++) {
            if (arr[k-1] % j == 0) {
                sum2 = sum2 + j;
            }
        }
        for (int i = 0; i < k; i++) {
            int sum1 =0;
            for (int j = 1; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    sum = sum + i;
                }
                if(sum2==arr[i] && sum1==arr[k-1]){
                    System.out.println("Amicable pair is:" + sum1+ " " +sum1);
                }
            }
        }
    }
}