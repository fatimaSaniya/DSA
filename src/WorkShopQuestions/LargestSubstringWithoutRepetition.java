package WorkShopQuestions;

import java.util.Scanner;

public class LargestSubstringWithoutRepetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();
        String a = "", s = "";
        int max = 0;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            //System.out.println(a.indexOf(ch));
            if (a.indexOf(ch) < 0) {
                a = a + ch;
            } else {
                if (max < a.length()) {
                    max = a.length();
                    s = a;
                }
                a = a.substring(a.indexOf(ch) + 1) + ch;
            }
            if (max < a.length()) {
                max = a.length();
                s = a;
            }
        }
        System.out.println("Substring is: " + s);
        System.out.println("Length is:" + max);
    }
}
