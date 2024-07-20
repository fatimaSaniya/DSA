package WorkShopQuestions;
import java.util.Scanner;

public class MinStepsToOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.print(num+ "->");
        int steps = minSteps(num);

        if (steps != -1) {
            System.out.println();
            System.out.println("Minimum steps to reach 1: " + steps);
        } else {
            System.out.println("Number cannot be reduced to 1 using the given operations.");
        }
    }

    public static int minSteps(int num) {
        if (num == 1) {
            return 0;
        }

        // Prioritize division by 3 for fewer steps in most cases
        if (num-1 % 3 == 0 || num-1 % 2 == 0 ) {
            System.out.print(num-1 + " ");
            return 1 + minSteps(num - 1);
        }
        if (num % 3 == 0) {
            System.out.print(num/3+ " ");
            return 1 + minSteps(num / 3);
        } else {
            System.out.print(num/2+ " ");
            return 1 + minSteps(num / 2);
        }
    }
}
