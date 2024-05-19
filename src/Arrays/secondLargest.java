package Arrays;

public class secondLargest {
    public static void main(String[] args) {
        int []arr = {2,5,7,23,97,3,6,78,23,90};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < 6; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (smax < arr[i] && arr[i]!=max)
                smax = arr[i];
        }
        System.out.println(smax);
    }
}
