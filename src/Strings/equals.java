package Strings;

public class equals {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        System.out.println(a==b);
        System.out.println(a==c); // == equals check address in string not values
        System.out.println(a.equals(c));
        System.out.println(a.equals(b)); // equals checks value by value
    }
}
