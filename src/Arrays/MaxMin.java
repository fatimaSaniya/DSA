package Arrays;

public class MaxMin {
    public static void main(String[] args) {
        MinMax();
    }
    // Maximum and Minimum element and array
    static void MinMax() {
        int[] a = {331, -2, 3, 4, 5, 600};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 6; i++) {
            if (min > a[i])
                min = a[i];
        }
        for (int i = 0; i < 6; i++) {
            if (max < a[i])
                max = a[i];
        }

       // mx = Math.max(mx,a[i]);
        System.out.println("Maximum value in an array is: " + max);
        System.out.println("Minimum value in an array is: " + min);
    }
}
