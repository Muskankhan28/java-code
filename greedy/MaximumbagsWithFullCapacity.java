package greedy;
import java.util.*;

public class MaximumbagsWithFullCapacity {

    public static int maximumBags(int capacity[] , int rocks[] , int additionalRocks){
        int n = capacity.length;
        int requiredrocks[] = new int[n];
        for(int i=0;i<n;i++){
            requiredrocks[i] = capacity[i]-rocks[i];
        }
        int maxFullBagCount = 0;
        Arrays.sort(requiredrocks);
        for(int i=0;i<n;i++){
            if(requiredrocks[i] == 0){
                maxFullBagCount++;
            }
            else{
                if(requiredrocks[i]<=additionalRocks){
                    additionalRocks = additionalRocks-requiredrocks[i];
                    maxFullBagCount++;
                }
                else{
                    break;
                }
            }
        }
        return maxFullBagCount;
    }
    public static void main(String[] args) {
        int capacity[] = {10,2,2};
        int rocks[] = {2,2,0};
        int additionalRocks = 100;
        int ans = maximumBags(capacity, rocks, additionalRocks);
        System.out.println(ans);
    }
    
}
