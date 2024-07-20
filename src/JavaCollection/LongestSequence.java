package JavaCollection;
import java.util.HashSet;
import java.util.Set;
//Time complexity = O(2n) = O(n);
//1. O(n)  = store elements in set   2. O(n) = second for each loop
//Space complexity =  O(n) - space of creating a new set
public class LongestSequence {
    public static void main(String[] args) {
        int[] arr = {550, 552, 1, 2, 3, 4, 700, 701, 702};
        Set<Integer> set = new HashSet<>();
        for (int num: arr) {
            set.add(num);
        }
        int longestStreak = 0;
        for (int num: set) {
            if(!set.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;

                while(set.contains(currentNum+1)){
                    currentNum+=1;
                    currentStreak+=1;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        System.out.println("Longest streak is: " + longestStreak);
    }
}
