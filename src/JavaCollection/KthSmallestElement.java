package JavaCollection;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class KthSmallestElement {
    public static void main(String[] args) {
        int k = 5 ;
        Integer[] arr = {6, 20, 4, 18, 21, 50, 5, 8, 10};
        List<Integer> list = Arrays.asList(arr);
        Collections.sort(list);
        System.out.println(list.get(k-1));
    }
}
