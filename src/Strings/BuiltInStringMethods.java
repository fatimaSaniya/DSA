package Strings;
import java.util.Scanner;
public class BuiltInStringMethods {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //charAT
        String str = "Saniya Fatima";
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(7));
     //   System.out.println(str.charAt(19)); shows error bcoz out of bound

        //length()
        int l = str.length();
        System.out.println(l);

        //indexOf
        String s = "Saniya Fatima is 20 years old";
        System.out.println(s.indexOf('n'));
        System.out.println(s.indexOf('f'));
        System.out.println(s.lastIndexOf('a'));

        //comparesTo
        System.out.println("comparesTo operations: ");
        String a = "abc";
        String b = "bbc";
        System.out.println(a.compareTo(b));
        a = "fbc";
        b = "bbc";
        System.out.println(a.compareTo(b));
        a = "abcgggg";
        b = "abc";
        System.out.println(a.compareTo(b));
        a = "abc";
        b = "abchhha";
        System.out.println(a.compareTo(b));

        //contains
        System.out.println(s.contains("S"));
        System.out.println(s.startsWith("Sani"));
        System.out.println(s.endsWith("a"));

        //lower case
        System.out.println(s.toLowerCase());

        //upper case
        System.out.println(s.toUpperCase());

        //Concat
        System.out.println(a.concat(b));

        //substring
        System.out.println(str.substring(3));
        System.out.println(str.substring(4,8)); // 8 =8-1
        System.out.println(str.substring(4,4)); // 4=4-1 so prints nothing
        System.out.println(str.substring(4,5));

        //+ operator
        System.out.println(s+str);
        System.out.println(10+20+s);
        System.out.println(str+10+20);
        s = s+10;
        System.out.println(s);

        //IntegerToString
        System.out.print("enter no: ");
        int n = sc.nextInt();
        String x = Integer.toString(n);
        System.out.println(x.length());

    }
}
