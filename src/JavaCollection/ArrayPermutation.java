package JavaCollection;
import java.util.*;
public class ArrayPermutation {
    public static void main(String[] args) {
        Integer[] arr1 = {7,8,4,5,6,9}; Integer[] arr2 = {4,5,6,7,8,9};
        List<Integer> list1 = Arrays.asList(arr1); List<Integer> list2 = Arrays.asList(arr2);
        Collections.sort(list1); Collections.sort(list2);
        System.out.println(list1); System.out.println(list2);
        if(list1.equals(list2)) System.out.println("True");
        else System.out.println("False");
    }
}
