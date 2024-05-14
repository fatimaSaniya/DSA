package Strings;

import java.util.Scanner;

public class toggleChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to toggle: ");
        StringBuilder sbr = new StringBuilder(sc.nextLine());
        int n = sbr.length();
        for(int i=0;i<n;i++){
            char ch = sbr.charAt(i);
            int ascii = (int)ch;
            if(ascii>=65 && ascii<=90){ //capital
                ascii+=32;

            }
            else if (ascii>=97 && ascii<=122){//small
                ascii-=32;
            }
            ch = (char)ascii;
            sbr.setCharAt(i,ch);
        }
        System.out.println(sbr);
    }
}
