package Assessment;

import java.util.Scanner;

public class RatProblem {
    public static int food(int r, int unit, int[] arr) {
        if(arr.length==0) return -1;
        int sum = 0;
        int total = r * unit;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum >= total) return i + 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rats: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of units ");
        int unit = sc.nextInt();
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(food(r, unit, arr));
    }
}
