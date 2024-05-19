package Arrays;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.println("Enter the rows for 1st array");
        m =sc.nextInt();
        System.out.println("Enter the columns 1st array");
        n =sc.nextInt();
        int [][]arr = new int[m][n];
        System.out.println("Enter elements in 1st array");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int [][]crr= new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j){
                    crr[i][j] = arr[i][j];
                }
                else{
                    crr[i][j] = arr[j][i];
                }
            }
        }
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(crr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}