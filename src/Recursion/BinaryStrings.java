package Recursion;

import java.util.Scanner;

public class BinaryStrings {
    public static void printStrings(String s, int n){
        int l = s.length();
        if(l==n){
            System.out.println(s);
            return;
        }
        if(l==0 || s.charAt(l-1) == '0') {
            printStrings(s+0,n);
            printStrings(s+1,n);
        }
        else printStrings(s+0,n);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        printStrings("", n);
    }
}
