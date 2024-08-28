package ArrayAssignmentQuestion;

public class DifferenceOfOddEvenIndices {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,8,4,9,18};
        int evenSum = 0, oddSum = 0, diff;
        for (int i = 0; i < arr.length; i++) {
            if(i%2 == 0) evenSum += arr[i];
            else oddSum += arr[i];
        }
        diff = Math.abs(evenSum - oddSum);
        System.out.println(diff);
    }
}
