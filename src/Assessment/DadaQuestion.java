package Assessment;
import java.util.Scanner;
public class DadaQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of apple you need: ");
        int n = sc.nextInt();
        System.out.print("Enter the lot size shop A: ");
        int m1 = sc.nextInt();
        System.out.print("Enter the price for shop A: ");
        int p1 = sc.nextInt();
        System.out.print("Enter the lot size for shop B: ");
        int m2 = sc.nextInt();
        System.out.print("Enter the price for shop A: ");
        int p2 = sc.nextInt();
        //int n = 25, m1 = 5, p1 = 10, m2 = 10, p2 = 20;
        int sum = 0;
        if(m1<m2 || p1<p2){
            int k = n-m2;
            k = k/m1;
            sum = sum+p2;
            sum = sum+k*p1;
        }
        System.out.println(sum);
    }
}
