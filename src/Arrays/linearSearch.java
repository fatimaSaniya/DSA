package Arrays;
import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target element: ");
        int x = sc.nextInt();
        int []arr = {2,5,7,23,97,3,6,78,23,90};

        //solution
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                flag = true;
                break;
            }
        }
        if (flag) System.out.println("Element found");
        else System.out.println("Element not found");
    }
}
