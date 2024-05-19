package WorkShopQuestions;

public class SearchAndDeleteValue {
    public static void main(String[] args) {
        int []a = {5,78,96,15,25};
        int find = 96;
        int idx =-1;
        for (int i = 0; i <a.length ; i++) {
            if(a[i] == find){
                System.out.println("Index value is: "+i);
                idx = i;
                break;
            }
        }
        System.out.println(idx);
        for (int i = idx; i < a.length-1; i++) {
                a[i] = a[i+1];
        }
        a[a.length-1] =0;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
