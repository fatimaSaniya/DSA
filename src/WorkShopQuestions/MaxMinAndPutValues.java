package WorkShopQuestions;

public class MaxMinAndPutValues {
    public static int min(int[] a){
        int idx = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 6; i++) {
            if (min > a[i]) {
                min = a[i];
                idx = i;
            }
        }
        System.out.println("Minimum value in an array is: " + min);
        return idx;
    }
    public static int max(int[] a){
        int idx = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
                idx = i;
            }
        }
        System.out.println("Maximum value in an array is: " + max);
        return idx;
    }

    public static int[]  putValue(int[] a, int idx1, int idx2) {
        int c[] = new int[a.length+2];
        int value =5;
        for (int i = 0,j=0; i < a.length; i++) {
            if(i!=idx1 && i!=idx2) {
                c[j] = a[i];
                j++;
            }
            else if(i == idx1) {
                c[j] = a[i];
                c[++j] = value;
                j++;
            }
            else if(i == idx2) {
                c[j] = a[i];
                c[++j] = value;
                j++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int[] a = {331, -2, 3, 4, 15, 600};
        int idx1 = min(a);
        int idx2 = max(a);
        int []c = putValue(a,idx1,idx2);
        for (int i = 0; i < c.length ; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
}

