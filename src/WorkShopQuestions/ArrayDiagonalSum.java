package WorkShopQuestions;

public class ArrayDiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int n = arr.length;

        if (n != arr[0].length) {
            System.out.println("Sum of diagonals not possible!!");
        } else {
            int sum1 = 0;
            for (int i = 0; i < n; i++) {
                sum1 += arr[i][i]; // Principal diagonal
                sum1 += arr[i][n-1-i]; // Secondary diagonal
            }
            System.out.println("Total sum of diagonal is:" + sum1);
        }
    }
}
