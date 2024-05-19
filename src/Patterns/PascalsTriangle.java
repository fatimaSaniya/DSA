package Patterns;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n=6;
        for (int i = 1; i<n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            int s=1;
            for (int j = 1; j <= i; j++) {
                System.out.print(s+ " ");
                s=s*(i-j)/j;
            }
            System.out.println();
        }

    }
}
