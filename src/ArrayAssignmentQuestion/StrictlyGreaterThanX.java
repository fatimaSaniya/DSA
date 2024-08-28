package ArrayAssignmentQuestion;

public class StrictlyGreaterThanX {
    public static void main(String[] args) {
        int[] arr = {100,20,25,256,28,45,69,87};
        int x = 50, count = 0;
        for(int ele : arr)
            if(ele > x) count++;
        System.out.println(count);
    }
}
