package arrays;
import java.util.*;

public class noappearsonces {
    public static int findsingleno(int nums[]){
        int xor = 0;
        for(int i=0;i<nums.length;i++){
            xor = xor ^ nums[i];
        }
        return xor;
    }





    // brute approach 


    // public static int singleno(int nums[]){
    //     HashMap<Integer,Integer>map = new HashMap<>();
    //     for(int i=0;i<nums.length;i++){
    //         if(map.containsKey(nums[i])){
    //             map.put(nums[i], map.get(nums[i]) +1);
    //         }
    //         else{
    //             map.put(nums[i], 1);
    //         }
    //     }

    //     Set<Integer>keys = map.keySet();
    //     for (Integer i : keys) {
    //         if(map.get(i) == 1){
    //             return i;
    //         }
            
    //     }
    //     return -1;
    // }
    public static void main(String[] args) {
        int nums[] = {1,1,2,3,3,4,4};
        // System.out.println(singleno(nums));

        System.out.println(findsingleno(nums));
    }
    
}
