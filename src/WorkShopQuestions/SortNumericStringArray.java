package WorkShopQuestions;

import java.util.Arrays;

public class SortNumericStringArray {
    public static void main(String[] args) {
        numericArraySort();
        stringArraySort();
    }

    public static void numericArraySort(){
        int[] a = {5, 78, 96, 15, 25};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
    public static void stringArraySort(){
        String[] str = {"Saniya", "Shivi", "Sneha", "Sakshi", "Saurabh"};
        int size = str.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < str.length; j++)
                if (str[i].compareTo(str[j]) > 0) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
        }
        System.out.println();
        System.out.println(Arrays.toString(str));
    }
}
