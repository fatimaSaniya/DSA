package PatternAssignmentQuestion.java;
public class Pattern4 {
    public static void main(String[] args) {
        int k;
        for (int i = 1; i <= 5; i++) {
            k = 65;
            for (int j = 1; j <=i ; j++) {
                if(i%2!=0){
                    System.out.print(j+ " ");
                }
                else {
                    System.out.print((char)k + " ");
                    k++;
                }
            }
            System.out.println();
        }
    }
}
