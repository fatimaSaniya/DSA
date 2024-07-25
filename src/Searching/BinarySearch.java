package Searching;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {31, 54, 69, 85, 98, 106, 155,};
        int n = arr.length;
        int idx = -1;
        boolean flag = true;
        int target = 98;
        int low = 0, high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] < target) low = mid+1;
            else if (arr[mid] > target) high = mid-1;
            else if (arr[mid] == target) {
                flag = true;
                idx = mid;
                break;
            }
        }
        if(flag) System.out.println("Target element at index "+idx);
        else System.out.println("Target doesn't exist!");
    }
}
