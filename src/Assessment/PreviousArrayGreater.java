package Assessment;
import java.util.Scanner;

public class PreviousArrayGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 1;
        int flag = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j<=i-1; j++) {
                if(arr[i] < arr[j]){
                    flag = 1;
                    break;
                }
                if(flag == 0) count++;
            }
        }
        System.out.println(count);
    }
}
