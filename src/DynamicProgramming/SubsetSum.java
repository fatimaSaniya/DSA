package DynamicProgramming;
public class SubsetSum {
    public static boolean isSubset(int i, int[] val, int target, int[][]dp){
        if(i == val.length){
            if(target == 0) return true;
            return false;
        }
        if(dp[i][target] != -1) return (dp[i][target] == 1);
        boolean ans = false;
        boolean skip = isSubset(i+1, val, target, dp);
        if(target - val[i] < 0) ans = skip;
        else {
            boolean pick = isSubset(i+1, val, target - val[i], dp);
            ans = pick || skip;
        }
        dp[i][target] = (ans)? 1 : 0;
        return ans;
    }
    public static void main(String[] args) {
        int[] val = {0,8,5,2,4};
        int target = 9;
        // i = 0 to n-1 && target = target to 0
        int[][] dp = new int[val.length][target+1];
        for (int i = 0; i < val.length; i++)
            for (int j = 0; j < target+1; j++) dp[i][j] = -1;
        System.out.println(isSubset(0,val, target, dp));
    }
}
