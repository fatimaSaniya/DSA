package Recursion;

public class SkipCharacter {
    public static void skip(int i, String str, String ans){
        if(i>= str.length()) {
            System.out.println(ans);
            return;
        }
        if(str.charAt(i)!='a') ans+= str.charAt(i);
        skip(i+1, str, ans);
    }
    public static void main(String[] args) {
        String str = "Saniya Fatima";
        System.out.println(str);
        skip(0, str, "");
    }
}
