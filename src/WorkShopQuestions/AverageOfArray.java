package WorkShopQuestions;

import java.util.Scanner;

public class AverageOfArray {
    public static void main(String[] args) {
        int []a = {5,78,96,15,25};
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum+a[i];
        }
        double avg = sum/a.length;
        System.out.println(avg);
    }

    public static class ReverseWords {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter string : ");
            String originalStr = sc.nextLine();

            String words[] = originalStr.split(" ");
            String revStr = "";
            for (int i = 0; i < words.length; i++) {
                if (i == words.length - 1)
                    revStr = words[i] + revStr;
                else
                    revStr = " " + words[i] + revStr;
            }
            System.out.print("Reversed string : " + revStr);

        }
    }
}
