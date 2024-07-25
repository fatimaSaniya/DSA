package Strings;
public class DeleteAndInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("saniya");
        System.out.println(sb);
        sb.deleteCharAt(4);
        System.out.println(sb);
        sb.append("fatima");
        sb.delete(5,9);
        System.out.println(sb);
        sb.insert(5, "fati");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
