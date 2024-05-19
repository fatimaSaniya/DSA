package Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        String newStr = "";
        char ch;
        System.out.println("Original String " + str);

        //reverse string
        for (int i=0; i<str.length() ; i++) {
            ch = str.charAt(i);
            newStr = ch+newStr;
        }
        System.out.println(newStr);
    }
}
