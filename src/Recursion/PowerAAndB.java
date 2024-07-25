package Recursion;
import java.util.Scanner;
public class PowerAAndB {
    public static int pow(int a, int b){ // T.C. = O(b)
        if(b==0) return 1;
        return a*pow(a,b-1);
    }
    public static int pow2(int a, int b){ // T.C. = O(log b)
        if(b==0) return 1;
        int ans = pow2(a,b/2);
        if(b%2==0) return ans * ans;
        else return ans * ans * a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int a = sc.nextInt();
        System.out.print("Enter power number: ");
        int b = sc.nextInt();
        System.out.println(a+ "^" + b+ " is: " +pow(a,b));
        System.out.println(a+ "^" + b+ " is: " +pow2(a,b));
    }
}
