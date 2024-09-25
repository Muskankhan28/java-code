package dynamicProgramming;

import java.util.Arrays;

public class questions {

    // recurrsive code time complexity exponential 0(2^n)
    public static int climbingStairs(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return climbingStairs(n-1) + climbingStairs(n-2);
    }


    // optimization 

    // memoization code
    // time complexity =  O(n)

    public static int ClimbingStairs(int n , int dp[]){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = ClimbingStairs(n-1, dp) + ClimbingStairs(n-2, dp);
        return dp[n];
     
    } 


    // optimization 

    // tabulation code
    // timecomplexity = O(n)
    public static int CountWaysTabulation(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    // tabulation code
    // timecomplexity = O(n) 
    public static int CountWaysTab(int n){
        int dp[] = new int [n+1];
        dp[0] = 1;
        for(int i=1;i<=n;i++){
            if(i == 1){
                dp[i] = dp[i-1] ;
            }
            else{
                dp[i] = dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        // int dp[] = new int[n+1];
        // Arrays.fill(dp , -1);
        // System.out.println(ClimbingStairs(n, dp));


        // System.out.println(CountWaysTabulation(n));

        System.out.println(CountWaysTab(n));
      
    }
}
