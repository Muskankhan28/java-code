package arrays;
import java.util.*;

public class removeee {
    public static int removeduplicate(int nums[]){
        int n = nums.length;
        int i=0;
        int j = i+1;
        while(j<n){
            if(nums[i] != nums[j]) {
                j++;
            }
        }
        // int j=0;
        // HashSet<Integer>set = new HashSet<>();
        // for(int i=0;i<n;i++){
        //     set.add(nums[i]);
        // }
        // for (Integer k : set) {
        //     nums[j] = k;
        //     j++;

            
        // }
        // return set.size();


    }
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeduplicate(nums));
    }
    
}
