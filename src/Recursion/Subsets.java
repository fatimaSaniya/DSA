package Recursion;
import java.util.ArrayList;
// Time complexity = O(2^n)
public class Subsets {
    static ArrayList<String> arr = new ArrayList<>();
    public static void printSubsets(int i, String str, String ans){
        if(i>= str.length()) {
            arr.add(ans);
            return;
        }
        char ch = str.charAt(i);
        printSubsets(i+1, str, ans+ch); //take
        printSubsets(i+1, str, ans); //not take
    }
    public static void main(String[] args) {
        String str = "abc";
        arr = new ArrayList<>(); //reset
        System.out.println(str);
        printSubsets(0, str, "");
        System.out.println(arr);
        System.out.println(arr.size());
    }
//    static List<List<Integer>> arr;
//    public void helper(int i, int[] nums, ArrayList<Integer> ans){
//        if(i>= nums.length) {
//            ArrayList<Integer> list = new ArrayList<>();
//            for(int j =0; j<ans.size(); j++) list.add(ans.get(j));
//            arr.add(list);
//            return;
//        }
//
//        helper(i+1, nums, ans); //take
//        ans.add(nums[i]);
//        helper(i+1, nums, ans); //not take
//        ans.remove(ans.size()-1);
//    }
//    public List<List<Integer>> subsets(int[] nums) {
//        arr = new ArrayList<>();
//        ArrayList<Integer> ans = new ArrayList<>();
//        helper(0, nums, ans);
//        return arr;
//    }
}
