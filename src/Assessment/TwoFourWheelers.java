package Assessment;

import java.util.Scanner;

public class TwoFourWheelers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of vehicles");
        int v = sc.nextInt();
        System.out.println("Enter no of wheels");
        int w = sc.nextInt();
        if(w<2 || w%2!=0 || v>w){
            System.out.println("Invalid case!!");
        }
        //int  v = 200, w = 540;
        else {
            int diff = w / 2;
            int fw = diff - v;
            int tw = v - fw;
            System.out.println("Two wheeler: " + tw);
            System.out.println("Four wheeler: " + fw);
        }
    }
}
