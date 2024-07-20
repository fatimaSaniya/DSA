package JavaCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class AnagramString {
    public static void main(String[] args) {
        String str1 = "silent"; String str2 = "listen";
        char[] arr1 = str1.toCharArray(); char[] arr2 = str2.toCharArray();
        List<Character> list1 = new ArrayList<>(); List<Character> list2 = new ArrayList<>();
        for (char ch: arr1) {
            list1.add(ch);
        } for (char ch: arr2) {
            list2.add(ch);
        }
        Collections.sort(list1); Collections.sort(list2);
        System.out.println(list1); System.out.println(list2);
        if(list1.equals(list2)) System.out.println("True");
        else System.out.println("False");
    }
}
