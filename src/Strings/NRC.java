package Strings;
import java.util.Scanner;
public class NRC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length() ; i++) {
            int flag = 0;
            char ch1 = str.charAt(i);
            for (int j = i+1; j < str.length(); j++) {
                char ch2 = str.charAt(j);
                if(ch1 == ch2) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
