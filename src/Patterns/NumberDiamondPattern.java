package Patterns;
public class NumberDiamondPattern {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            int space = 4 - i;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j < i - j; j++) {
                System.out.print(i);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 3; i >= 1; i--) {
            int space = 4 - i;
            for (int j = space; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j < i - j; j++) {
                System.out.print(i);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
