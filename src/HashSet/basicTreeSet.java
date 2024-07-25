package HashSet;
import java.util.TreeSet;
public class basicTreeSet {
    public static void main(String[] args) {

        // Print in sorted manner
        TreeSet<Integer> set = new TreeSet<>();
        // ONLY UNIQUE ELEMENTS
        //Insert
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        set.add(200);
        //iterating using for each: because for and while loop is not possible as there is no indexing in hashset
        for (int ele: set) {
            System.out.print(ele + " ");
        }
    }
}
