package WorkShopQuestions;

import java.util.Scanner;

public class LongestPalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        String longPalin = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String subStr = str.substring(i, j);
                if (isPalindrome(subStr) && subStr.length() > longPalin.length()) {
                    longPalin = subStr;
                }
            }
        }
        System.out.println("Longest palindrome substring: " + longPalin);
    }

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i)!= str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}

//class Solution {
//    private void findPalindrome(char[] ch, int i, int[] indices) {
//        int l = i;
//        int r = i;
//        int n = ch.length;
//        if (i >= n - 1)
//            return;
//        while (r < n - 1 && ch[r] == ch[r + 1]) {
//            r++;
//        }
//        i = r;
//        while (l > 0 && r < n - 1 && ch[l - 1] == ch[r + 1]) {
//            l--;
//            r++;
//        }
//        if ((indices[1] - indices[0]) < (r - l)) {
//            indices[0] = l;
//            indices[1] = r;
//        }
//        findPalindrome(ch, i + 1, indices);
//    }
//
//    public String longestPalindrome(String s) {
//        char[] ch = s.toCharArray();
//        int[] indices = new int[2]; // indices[0] is start, indices[1] is end
//        findPalindrome(ch, 0, indices);
//        return s.substring(indices[0], indices[1] + 1);
//    }
//}