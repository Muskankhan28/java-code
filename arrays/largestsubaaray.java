package arrays;

public class largestsubaaray {

    public static int getlongestsubarray(int arr[] , int k){
        int n = arr.length;
        int sum = arr[0];
        int left=0;
        int right=0;
        int maxlength = 0;

        while(right<n){
            while(left<=right && sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum == k){
                maxlength = Math.max(maxlength, right-left+1);
            }
            right++;
            if(right<n){
                sum+=arr[right];
            }
        }
        return maxlength;

    }

    public static int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int currentsum = 0;
        for(int i=0;i<nums.length;i++){
            // currentsum+=nums[i];
            currentsum = Math.max(currentsum+nums[i],nums[i]);
            // if(currentsum<0){
            //     currentsum = 0;
            // }
            maxsum = Math.max(currentsum,maxsum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        // int arr[] = {1,2,3,1,1,1,1,4,2,3};
        // int k=3;
      
        int test_array []= {3, -2, 5, -1, 6, -3, 2, 7, -5, 4};
        System.out.println(maxSubArray(test_array));


        
        // System.out.println(getlongestsubarray(arr, k));
       
      
    }
    
}
