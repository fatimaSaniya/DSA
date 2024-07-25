package HashSet;
import java.util.HashSet;
public class BasicSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // ONLY UNIQUE ELEMENTS
        //Insert
        set.add(20);
        set.add(100);
        System.out.println("Size is: " + set.size());
        set.add(10);
        set.add(-8);
        set.add(200);
        System.out.println("Size is: " + set.size());
        System.out.println(set);

        //search -> true/false O(1)
        System.out.println(set.contains(10));

        //iterating using for each: because for and while loop is not possible as there is no indexing in hashset
        for (int ele: set) {
            System.out.print(ele + " ");
        }
    }
}
