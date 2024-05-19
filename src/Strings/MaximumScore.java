//You are given a string s and two integers x and y. You can perform two types of operations any number of times.
//
//        Remove substring "ab" and gain x points.
//        For example, when removing "ab" from "cabxbae" it becomes "cxbae".
//        Remove substring "ba" and gain y points.
//        For example, when removing "ba" from "cabxbae" it becomes "cabxe".
//        Return the maximum points you can gain after applying the above operations on s.
//
//
//
//        Example 1:
//
//        Input: s = "cdbcbbaaabab", x = 4, y = 5
//        Output: 19
//        Explanation:
//        - Remove the "ba" underlined in "cdbcbbaaabab". Now, s = "cdbcbbaaab" and 5 points are added to the score.
//        - Remove the "ab" underlined in "cdbcbbaaab". Now, s = "cdbcbbaa" and 4 points are added to the score.
//        - Remove the "ba" underlined in "cdbcbbaa". Now, s = "cdbcba" and 5 points are added to the score.
//        - Remove the "ba" underlined in "cdbcba". Now, s = "cdbc" and 5 points are added to the score.
//        Total score = 5 + 4 + 5 + 5 = 19.
//        Example 2:
//
//        Input: s = "aabbaaxybbaabb", x = 5, y = 4
//        Output: 20


package Strings;

import java.util.Scanner;

public class MaximumScore {
    public static int maximumGain(String s, int x, int y) {
        int aCount = 0;
        int bCount = 0;
        int lesser = Math.min(x, y);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c > 'b') {
                result += Math.min(aCount, bCount) * lesser;
                aCount = 0;
                bCount = 0;
            } else if (c == 'a') {
                if (x < y && bCount > 0) {
                    bCount--;
                    result += y;
                } else {
                    aCount++;
                }
            } else {
                if (x > y && aCount > 0) {
                    aCount--;
                    result += x;
                } else {
                    bCount++;
                }
                ;
            }
        }

        result += Math.min(aCount, bCount) * lesser;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x value: ");
        int x = sc.nextInt();
        System.out.println("Enter y value: ");
        int y = sc.nextInt();
        System.out.println("Enter string: ");
        String str;
        str = sc.next();
        int result = maximumGain(str,x,y);
        System.out.println(result);
    }
}