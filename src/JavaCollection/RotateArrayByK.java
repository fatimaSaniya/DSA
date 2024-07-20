package JavaCollection;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class RotateArrayByK {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        int k =100;
        k= k % arr.length;
        List<Integer> list = Arrays.asList(arr);
        Collections.rotate(list, k);
        System.out.println(list);
    }
}