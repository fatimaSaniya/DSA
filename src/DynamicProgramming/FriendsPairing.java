package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class FriendsPairing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp , -1);

        //System.out.println(friend(n,dp));
        System.out.println(pair(n,dp));
    }
    public static int pair(int n,int[] dp){
        if(n<=2) return n-1;
        if(dp[n] != -1) return dp[n];
        return dp[n] = (n - 1) * pair(n-1,dp) + pair(n-2,dp);
    }
    public static int friend(int n,int[] dp){
        dp[0] = 0; dp[1]= 1;
        if(n>1) dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + (i-1)*dp[i-2];
        }
        return dp[n];
    }
}
