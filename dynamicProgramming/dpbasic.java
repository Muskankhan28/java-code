package dynamicProgramming;

public class dpbasic {
    // dp code for fibonacci 
    // time complexity = 0(n)
    // memoziation code 
    public static int fibonacci(int n , int dp[]){
        // base case
        if(n==0 || n==1){
            return n;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n]=fibonacci(n-1, dp)+fibonacci(n-2, dp);
        return dp[n];
    }

    // tabulation code for fibonnaci 
    // time complexity = 0(n)

    public static int fibTabulation(int n){
        int dp[] = new int [n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    
    public static void main(String[] args) {
        int n=6;

        // int dp[] = new int[n+1];
        // System.out.println(fibonacci(n, dp));

        System.out.println(fibTabulation(5));
    }
}
