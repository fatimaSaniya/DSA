package ArrayAssignmentQuestion;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,4,3,2,4};
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if(arr[i] == arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(isDuplicate) continue;
            int dup = 0;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    dup++;
                }
            }
            if(dup > 0) System.out.println(arr[i]);
        }
    }
}