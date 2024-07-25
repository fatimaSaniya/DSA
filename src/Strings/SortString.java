package Strings;
import java.util.Arrays;
public class SortString {
    public static void main(String[] args) {
        String s = "saniya";
        char []ch = s.toCharArray();
        Arrays.sort(ch);
        for (char ele: ch) {
            System.out.print(ele+ " ");
        }
        System.out.println();
        StringBuilder sb = new StringBuilder(s);
        char [] ch1 = sb.toString().toCharArray();
        Arrays.sort(ch);
        for (char ele: ch) {
            System.out.print(ele+ " ");
        }
    }
}
