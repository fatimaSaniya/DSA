package JavaCollection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class RemoveArrayDuplicate {
    public static void main(String[] args) {
        Integer[] arr = {1,1,1,2,2,3,4,1,5,6,6,5,7};
        List<Integer> list = Arrays.asList(arr);
        Set<Integer> set = new HashSet<>(list);
        // set.addAll(List.of(arr)); //set does not array as array is static and set takes dynamic data structure only.
        System.out.println(set);
    }
}