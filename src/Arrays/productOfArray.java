package Arrays;

public class productOfArray {
    public static void main(String[] args) {
        int []arr = {2,5,2,3,6,2,};
        int pro=1;
        for (int i = 0; i < arr.length; i++) {
            pro *= arr[i];
        }
        System.out.println("Product is: " + pro);
    }
}
