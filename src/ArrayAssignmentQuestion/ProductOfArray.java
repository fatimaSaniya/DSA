package ArrayAssignmentQuestion;
public class ProductOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int prod = 1;
        for (int ele: arr) prod *= ele;
        System.out.println("The product of array is: " + prod);
    }
}
