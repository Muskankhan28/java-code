package greedy;

public class MinimumTimeToMakeRopeColorfull {
    public static int minCost(String colors , int neededTime[]){
        int n = colors.length();
        int time = 0;
        int previousMax = 0;
        for(int i=0;i<n;i++){
            if(i>0 && colors.charAt(i) != colors.charAt(i-1)){
                previousMax = 0;
            }
            int CurrentMax = neededTime[i];
            time += Math.min(previousMax , CurrentMax);
            previousMax = Math.max(previousMax, CurrentMax);

        }
        return time;
    }
    public static void main(String[] args) {
        String colors = "aabaa";
        int neededTime[] = {1,2,3,4,1};
        int ans = minCost(colors, neededTime);
        System.out.println(ans);
    }
    
}
