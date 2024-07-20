package JavaCollection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class IntersectionOfArray{
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4,5,6};
        Integer[] arr2 = {4,5,6,7,8,9};
        Set<Integer> set1 = new HashSet<>(List.of(arr1));
        Set<Integer> set2 = new HashSet<>(List.of(arr2));
        set1.retainAll(set2);
        System.out.println(set1);
    }
}
