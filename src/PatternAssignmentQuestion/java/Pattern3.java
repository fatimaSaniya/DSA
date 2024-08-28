package PatternAssignmentQuestion.java;

public class Pattern3 {
    public static void main(String[] args) {
        int k;
        for (int i = 1; i <= 4; i++) {
            k = 65;
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)k + " ");
                k++;
            }
            System.out.println();
        }
    }
}
