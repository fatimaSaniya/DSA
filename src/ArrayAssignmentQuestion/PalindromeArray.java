package ArrayAssignmentQuestion;
public class PalindromeArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        int n = arr.length;
        boolean isPalindrome = true;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) System.out.println("Palindrome");
        else System.out.println("Not palindrome");
    }
}