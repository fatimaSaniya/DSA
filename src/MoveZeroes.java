import java.util.*;
public class MoveZeroes {

        public static void moveZeroes(int[] nums) {
            int k =0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    int temp = nums[k];
                    nums[k] = nums[i];
                    nums[i] = temp;
                    k++;
                }
            }
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array");
            int n = sc.nextInt();
            int []nums = new int[n];
            System.out.println("Enter array value's");
            for(int i = 0; i<n; i++){
                nums[i] = sc.nextInt();;
            }
            moveZeroes(nums);
            for(int i = 0; i<n; i++) {
                System.out.print(nums[i] + " ");
            }
        }
    }