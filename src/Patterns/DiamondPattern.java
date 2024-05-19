package Patterns;

public class DiamondPattern {
    public static void main(String[] args) {
        int n=4;
//        for (int i = 1; i <= n; i++) {
//            int space = n - 1;
//            for (int j = 1; j <= space - i + 1; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = n-1; i >=0; i--) {
            int space =1;
            for (int j = space; j<=n-i; j++) {
                    System.out.print(" ");
                }
            for (int j = 2*i-1; j >=1; j--) {
                    System.out.print("*");
                }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            int space = n - 1;
            for (int j = 1; j <= space - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
