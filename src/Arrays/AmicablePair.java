package Arrays;

public class AmicablePair {
    public static void main(String[] args) {
        int n1=220,n2=284;
        int  sum1 = 0,sum2 =0;
        for (int i = 1; i <n1; i++) {
            if (n1 % i == 0) {
                sum1 = sum1 + i;
            }
        }
            for (int i = 1; i<n2; i++) {
                if (n2 % i == 0) {
                    sum2 = sum2 + i;
                }
            }
            if(sum2==n1 && sum1==n2){
                System.out.println("Amicable pair is:" + sum1+ " " +sum2);
            }
        }
    }