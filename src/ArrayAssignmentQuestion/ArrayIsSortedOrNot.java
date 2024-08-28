package ArrayAssignmentQuestion;

public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,8,45,69,87};
        boolean flag = false;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                flag = true;
                break;
            }
        }
        if(flag) System.out.println("Not sorted");
        else System.out.println("Sorted");
    }
}
