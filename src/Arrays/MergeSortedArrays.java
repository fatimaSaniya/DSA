package Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] a = {1,3,5,7};
        int[] b = {2,4,6,8};
        int[] c = new int[8];
        int i=3, j=3, k=7;
        while(i>0 && j>0){
            if(a[i]>b[j]){
                c[k]= a[i];
                i--;
            }
            else{
                c[k]= b[j];
                j--;
            }k--;
        }
        if (i>0){
            while (j>0){
                c[k] = b[j];
                j--;k--;
            }
        }
        if (j>0){
            while (i>0){
                c[k] = a[i];
                i--;k--;
            }
        }
        for (int m = 0; m<8; m++)
            System.out.print(c[m] + " ");
    }
}
