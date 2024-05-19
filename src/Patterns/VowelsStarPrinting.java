package Patterns;
import java.util.Scanner;
public class VowelsStarPrinting {
    static int abs(int d)
    {
        return d < 0 ? -1 * d : d;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vowel from A,E,I,O,U only");
        String ch = sc.next();
        int height = 5, width = (2 * height) - 1;
        switch(ch){
            case "A":
                int n = width / 2, i, j;
                for (i = 0; i < height; i++)
                {
                    for (j = 0; j <= width; j++)
                    {
                        if (j == n || j == (width - n)
                                || (i == height / 2 && j > n
                                && j < (width - n)))
                            System.out.printf("*");
                        else
                            System.out.printf(" ");
                    }
                    System.out.printf("\n");
                    n--;
                }
                break;
            case "E":
                for (i = 0; i < height; i++)
                {
                    System.out.printf("*");
                    for (j = 0; j < height; j++)
                    {
                        if ((i == 0 || i == height - 1)
                                || (i == height / 2
                                && j <= height / 2))
                            System.out.printf("*");
                        else
                            continue;
                    }
                    System.out.printf("\n");
                }
                break;
            case "I":
                for (i = 0; i < height; i++)
                {
                    for (j = 0; j < height; j++)
                    {
                        if (i == 0 || i == height - 1)
                            System.out.printf("*");
                        else if (j == height / 2)
                            System.out.printf("*");
                        else
                            System.out.printf(" ");
                    }
                    System.out.printf("\n");
                }
                break;
            case "O":
                int space = (height / 3);
                width = height / 2 + height / 5 + space + space;
                for (i = 0; i < height; i++)
                {
                    for (j = 0; j <= width; j++)
                    {
                        if (j == width - abs(space)
                                || j == abs(space))
                            System.out.printf("*");
                        else if ((i == 0
                                || i == height - 1)
                                && j > abs(space)
                                && j < width - abs(space))
                            System.out.printf("*");
                        else
                            System.out.printf(" ");
                    }
                    if (space != 0
                            && i < height / 2)
                    {
                        space--;
                    }
                    else if (i >= (height / 2 + height / 5))
                        space--;
                    System.out.printf("\n");
                }
                break;
            case "U":
                for (i = 0; i < height; i++)
                {
                    if (i != 0 && i != height - 1)
                        System.out.printf("*");
                    else
                        System.out.printf(" ");
                    for (j = 0; j < height; j++)
                    {
                        if (((i == height - 1)
                                && j >= 0
                                && j < height - 1))
                            System.out.printf("*");
                        else if (j == height - 1 && i != 0
                                && i != height - 1)
                            System.out.printf("*");
                        else
                            System.out.printf(" ");
                    }
                    System.out.printf("\n");
                }
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
