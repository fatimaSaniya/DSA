package JavaCollection;

import java.util.*;

public class Merge2SortedArray {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4,5,6};
        Integer[] arr2 = {4,5,6,7,8,9};
        List<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));
        List<Integer> list2 = Arrays.asList(arr2);
        list1.addAll(list2);
        Collections.sort(list1);
        System.out.println(list1);
    }

}