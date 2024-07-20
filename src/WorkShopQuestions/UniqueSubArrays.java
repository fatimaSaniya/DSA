package WorkShopQuestions;
import java.util.*;
public class UniqueSubArrays {
    public static void countUniqueSubArrays(int[] arr, int k) {
        Set<String> uniqueSubArrays = new HashSet<>();

        for (int i = 0; i <= arr.length - k; i++) {
            int[] subArray = Arrays.copyOfRange(arr, i, i + k);
            uniqueSubArrays.add(Arrays.toString(subArray));
        }

        System.out.println("Count of unique subArrays: " + uniqueSubArrays.size());
        System.out.println("Unique subArrays: " + uniqueSubArrays);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2};
        int k = 3;
        countUniqueSubArrays(arr, k);
    }
}