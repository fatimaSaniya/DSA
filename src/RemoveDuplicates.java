import java.util.*;
public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];
            }
        }
        return k + 1;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int []nums = new int[n];
        System.out.println("Enter number in increasing order");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int k = removeDuplicates(nums);
        System.out.println(k);
        for(int i =0; i<n; i++){
            System.out.println(nums[i] + " ");
        }
    }
}
