package arrays;

import java.util.Arrays;

public class maxminpair {
    public static int minparisum(int nums[]){
        int n = nums.length;
        int i=0;
        int j=n-1;
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        while(i<j){
            int sum = nums[i]+nums[j];
            max=Math.max(max, sum);
            i++;
            j--;

        }
        return max;

    }
  
    public static void main(String[] args) {
        int nums[] ={3,5,2,3};
        System.out.println(minparisum(nums));
      
    }
    
}
