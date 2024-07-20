package WorkShopQuestions;

public class SubArraySum {
    public static int maxSumSubArray(int[] arr, int k) {
        if (k > arr.length) {
            System.out.println("Invalid value. k cannot be greater than the length of the array.");
            return -1;
        }
        if (k <= 0) {
            System.out.println("Invalid value. k cannot be less than 1.");
            return -1;
        }

        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            windowSum += arr[i];
            if (i >= k) {
                windowSum -= arr[i - k];
            }
            if (i >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 5, 4};
        int k = 0;
        System.out.println(maxSumSubArray(arr, k));  // Output: 9
    }
}
