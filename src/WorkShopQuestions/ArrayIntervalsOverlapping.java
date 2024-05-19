package WorkShopQuestions;

public class ArrayIntervalsOverlapping {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int n = arr.length;
        int m = arr[0].length;
        int k = 0, l = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i][m - 1] >= arr[j][0]) {
                    arr[i][m - 1] = arr[j][m - 1];
                    k = i;
                    l = j;
                }
            }
        }
        for (int i = 0; i <= k; i++) {
            for (int j = 0; j <= l; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        // System.out.println();
        for (int i = k + 2; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
