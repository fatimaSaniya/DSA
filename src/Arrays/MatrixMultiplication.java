package Arrays;

import java.util.Scanner;

public class MatrixMultiplication {
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
        int k,l;
        System.out.println("Enter the rows 2nd array");
        k =sc.nextInt();
        System.out.println("Enter the columns 2nd array");
        l =sc.nextInt();
        int [][]brr = new int[k][l];
        System.out.println("Enter elements in 2nd array");
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < l; j++) {
                brr[i][j] = sc.nextInt();
            }
        }
        int [][]crr= new int[m][l];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < l; j++) {
                crr[i][j] = 0;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < l; j++) {
                for (int k1 = 0; k1 < m; k1++) {
                    if(k!=n){
                        System.out.println("Multiplication not possible");
                    }
                    else{
                        crr[i][j] = arr[i][k1]*brr[k1][j] + crr[i][j];
                    }
                }
            }
        }
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <l ; j++) {
                System.out.print(crr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}