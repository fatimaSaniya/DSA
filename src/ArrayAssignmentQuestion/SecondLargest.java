package ArrayAssignmentQuestion;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {7,9,4,11,10,6};
        int lar = arr[0], secLar = arr[0];
        for(int i = 0; i < arr.length ; i++) {
            if (arr[i] > lar) {
                secLar = lar;
                lar = arr[i];
            } else if (arr[i] > secLar && arr[i] != lar) {
                secLar = arr[i];
            }
        }
        System.out.println(lar + "  " + secLar);
    }
}
