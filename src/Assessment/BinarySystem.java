//package Assessment;
//import java.util.Scanner;
//public class BinarySystem {
//    public static String binary(String str) {
//        if (str == null && str.length() <= 2) return str;
//        String ans = "";
//        char[] ch = str.toCharArray();
//        char n1 = ch[0];
//        char op = ch[1];
//        char n2 = ch[2];
//        if (op == 'A') {
//            if (n1 == 0 && n2 == 0) ans = "0";
//            if (n1 == 0 && n2 == 1) ans = "0";
//            if (n1 == 1 && n2 == 0) ans = "0";
//            if (n1 == 1 && n2 == 1) ans = "1";
//            System.out.println(ans);
//        }
//        if (op == 'B') {
//            if (n1 == 0 && n2 == 0) ans = "0";
//            if (n1 == 0 && n2 == 1) ans = "1";
//            if (n1 == 1 && n2 == 0) ans = "1";
//            if (n1 == 1 && n2 == 1) ans = "1";
//            System.out.println(ans);
//        }
//        if (op == 'C') {
//            if (n1 == 0 && n2 == 0) ans = "0";
//            if (n1 == 0 && n2 == 1) ans = "1";
//            if (n1 == 1 && n2 == 0) ans = "1";
//            if (n1 == 1 && n2 == 1) ans = "0";
//            System.out.println(ans);
//        }
//
//        return  binary(ans + str.substring(3));
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter string: ");
//        String str = sc.nextLine();
//        System.out.println(binary(str));
//    }
//}
package Assessment;
import java.util.Scanner;
public class BinarySystem {
    public static String binary(String str) {
        if (str == null || str.length() <= 2) return str;
        char[] ch = str.toCharArray();
        char n1 = ch[0];
        char op = ch[1];
        char n2 = ch[2];
        String ans;
        if (op == 'A') {
            ans = (n1 == '0' && n2 == '0') ? "0" : "1";
        } else if (op == 'B') {
            ans = (n1 == '1' || n2 == '1') ? "1" : "0";
        } else if (op == 'C') {
            ans = (n1 != n2) ? "1" : "0";
        } else {
            return "-1"; // Invalid operator
        }
        return binary(ans + str.substring(3));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        System.out.println(binary(str));
    }
}
