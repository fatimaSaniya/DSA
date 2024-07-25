package Strings;
//Strings are pass by value
public class MaxValue {
    public static void main(String[] args) {
        String []s = {"999", "1018", "0001018"};
        String maxS = s[0];
        for (int i=0;i<s.length;i++) {
            maxS = max(maxS, s[i]);
        }
        System.out.println(maxS);
    }
    public static String max(String a, String b){
        String s = purify(a);
        String t = purify(b);
        if(s.length() > t.length()) return s;
        if(s.length() < t.length()) return t;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) != t.charAt(i)){
                if(s.charAt(i) > t.charAt(i)) return a;
                else return b;
            }
        }
        if(a.length() >= b.length()) return a;
        else return b;
    }
    public static String purify(String s){
        for (int i=0;i<s.length();i++) {
             if(s.charAt(i) != '0') return s.substring(i);
        }
        return s;
    }
}
