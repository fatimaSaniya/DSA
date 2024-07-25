package Recursion;

public class StringTraversal {
    public static void recursiveTraversal(int i, String str){
        if(i>= str.length()) return;
        System.out.print(str.charAt(i));
        recursiveTraversal(i+1, str);
    }
    public static void main(String[] args) {
        String str = "Saniya Fatima";
        System.out.println(str);
        recursiveTraversal(0,str);
    }
}
