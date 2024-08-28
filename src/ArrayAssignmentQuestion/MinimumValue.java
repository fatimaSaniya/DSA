package ArrayAssignmentQuestion;

public class MinimumValue {
    public static void main(String[] args) {
        int[] arr = {4,2,5,7,64,-1,-11};
        int min = arr[0];
        for(int ele : arr) if(ele < min) min = ele;
        System.out.println(min);
    }
}
