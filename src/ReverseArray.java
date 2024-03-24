public class ReverseArray {

    public static void main(String[] args) {
        reverse();
    }
    static void reverse(){
        int[] a = {-331, 2, 3, 4, 5, 600};
        int []b = new int[6];
        int j=5;
        for(int i = 0 ; i < 6 ; i++){
            b[j]= a[i];
            j--;
        }
        System.out.println("Reverse array is:");
        for(int i = 0 ;i< 6; i++){
            System.out.println(b[i]);
        }
    }
}
