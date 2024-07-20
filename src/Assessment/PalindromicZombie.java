package Assessment;
import java.util.Scanner;
public class PalindromicZombie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time: ");
        String time = sc.nextLine();
        int diff = calDiffTime(time);
        System.out.println(diff);
    }
    public static int calDiffTime(String time)
    {
        String time1 = time.substring(3);
        String newTime = "";
        int k = 0;
        while(k < 2) {
            newTime =  time.charAt(k)+ newTime;
            k++;
        }
        int difference = Integer.parseInt(newTime) - Integer.parseInt(time1);
        if(difference< 0) {
            difference = 60 - Integer.parseInt(time1) - Math.abs(difference);
        }
        return difference;
    }
}
