package PrefixSum;

public class ScoreOfPrefix {
    public static void main(String[] args) {
        int[] arr = {2,3,7,5,10};
        long[] arr1 = findPrefixScore(arr);
        for (long ele : arr1) {
            System.out.println(ele);
        }
    }
    public static long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            System.out.println("Max - " + max);
            arr[i] = nums[i] + max;
        }
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }
}
