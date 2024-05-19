package WorkShopQuestions;

import java.util.HashMap;
import java.util.HashSet;

public class DuplicateAndIntersectionOfStrings {
    public static void main(String[] args) {
        String s1 = "SaniyaShivi";
        String s2 = "SaurabhSneha";
        HashSet<String> str = new HashSet<>();
        HashSet<String> str1 = new HashSet<>();
        String[] s3 = new String[10];
        String[] s4 = new String[10];
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j < s1.length(); j++) {
                if (s1.charAt(i) == s1.charAt(j)) {
                    str.add(String.valueOf(s1.charAt(i)));
                }
            }
        }
        System.out.print("Duplicate elements in str1: "+str);
        System.out.println();

        for (int i = 0; i < s2.length(); i++) {
            for (int j = i + 1; j < s2.length(); j++) {
                if (s2.charAt(i) == s2.charAt(j)) {
                    str1.add(String.valueOf(s2.charAt(i)));
                }
            }
        }
        System.out.print("Duplicate elements in str2: "+str1);
        System.out.println();

        System.out.print("Intersection of str1 and str2 is: ");
        str.retainAll(str1);
        System.out.println(str);
    }
}
