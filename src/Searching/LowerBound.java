package Searching;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {31, 54, 69, 69, 85, 98, 106, 155,};
        int n = arr.length;
        int lb = n;
        int target = 69;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) { //for upper bound arr[mid] > target
                lb = Math.min(lb, mid);
                high = mid - 1;
            } else low = mid + 1;
        }
        System.out.println(lb);
    }
}
