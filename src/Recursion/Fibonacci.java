package Recursion;
import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int t = fibonacci(n-1) +fibonacci(n-2);
        return t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}
