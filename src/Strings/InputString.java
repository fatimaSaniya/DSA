package Strings;
import java.util.Scanner;
public class InputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String str = sc.next();//take only the letter's before space
        System.out.println("Hi " + str);

        System.out.print("Enter your name: ");
        String str1 = sc.nextLine();//take the whole sentence
        System.out.println("Hi " + str1);

    }
}
