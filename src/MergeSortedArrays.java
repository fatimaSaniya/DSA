public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] a = {1,3,5,7};
        int[] b = {2,4,6,8};
        int[] c = new int[8];
        int i=0, j=0, k=0;
        while(i<4 && j<4){
            if(a[i]<b[j]){
                c[k]= a[i];
                i++;
            }
            else{
                c[k]= b[j];
                j++;
            }k++;
        }
        if (i==a.length){
            while (j<b.length){
                c[k] = b[j];
                j++;k++;
            }
        }
        if (j==b.length){
            while (i<a.length){
                c[k] = a[i];
                i++;k++;
            }
        }
        for (int m = 0; m<8; m++)
            System.out.print(c[m] + " ");
    }
}
