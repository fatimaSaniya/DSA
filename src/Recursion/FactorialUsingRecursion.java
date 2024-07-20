package Recursion;
public class FactorialUsingRecursion {
    public static int fact(int n){
        if(n==1) return 1;
        int fact = n*fact(n-1);
        return fact;
    }
    public static void main(String[] args) {
        int n = 5;
        int fact = fact(n);
        System.out.println(fact);
    }
}
