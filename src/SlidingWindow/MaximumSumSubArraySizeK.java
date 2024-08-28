package SlidingWindow;

public class MaximumSumSubArraySizeK {
    public static void main(String[] args) {
        int[] arr = {10,20,1,3,-40,80,10};
        int k = 4;
        int maxSum = 0;
//        for (int i = 0; i < arr.length-k+1; i++) {
//            int sum = 0;
//            for (int j = i; j < i+k; j++) {
//                sum += arr[j];
//            }
//            maxSum = Math.max(sum, maxSum);
//        }
        int i = 0, j = k-1, sum =0;
        for(int a = 0; a<k; a++) sum += arr[a];
        i++; j++;
        while(j< arr.length){
            sum = sum - arr[i-1] + arr[j];
            maxSum = Math.max(sum, maxSum);
            i++; j++;
        }
        System.out.println(maxSum);
    }
}
