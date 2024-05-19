package WorkShopQuestions;

public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        int size = a.length;
        int max = Integer.MIN_VALUE, maxEnd = 0;

        for (int i = 0; i < size; i++) {
            maxEnd = maxEnd + a[i];
            if (max< maxEnd)
                max = maxEnd;
            if (maxEnd < 0)
                maxEnd = 0;
        }
        System.out.println("Maximum contiguous sum is " + max);
    }
}