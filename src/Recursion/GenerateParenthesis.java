package Recursion;
import java.util.Scanner;
public class GenerateParenthesis {
    public static void printParenthesis(int open, int close, int n, String s){
        if(s.length()==2*n){
            System.out.println(s);
            return;
        }
        if(open<n) printParenthesis(open+1, close, n, s+"(");
        if(close<open) printParenthesis(open, close+1, n, s+")");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        printParenthesis(0,0,n,"");
    }
}
