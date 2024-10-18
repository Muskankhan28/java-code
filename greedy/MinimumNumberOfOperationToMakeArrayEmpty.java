package greedy;
import java.util.*;

public class MinimumNumberOfOperationToMakeArrayEmpty {
    public static int minOperations(int nums[]){
        int n = nums.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i])+1);
            }
            else{
                map.put(nums[i] , 1);
            }
        }
        int operations = 0;
        Set<Integer>key = map.keySet();
        for(Integer i:key){
            int freq = map.get(i);
            if(freq == 1){
                return -1;
            }
            operations += Math.ceil((double)freq/3);
        }
        return operations;
    }
    public static void main(String[] args) {
        int nums[] = {2,1,2,2,3,3};
        int ans = minOperations(nums);
        System.out.println(ans);
    }
    
    
}
