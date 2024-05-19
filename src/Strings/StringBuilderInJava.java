package Strings;

import java.util.Scanner;

public class StringBuilderInJava {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = "Saniya";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        StringBuilder x = new StringBuilder();
        System.out.println(x.capacity());
        StringBuilder y = new StringBuilder(7);
        System.out.println(y.capacity());

        //Input in StringBuilder
        System.out.print("Enter your string: ");
        StringBuilder sb1 = new StringBuilder(sc.nextLine());
        System.out.println(sb1);

        //setChatAt
        sb.setCharAt(2,'a');
        System.out.println(sb);

        //append
        sb.append('*');
        System.out.println(sb);
        sb.append(10);
        System.out.println(sb);
    }
}
