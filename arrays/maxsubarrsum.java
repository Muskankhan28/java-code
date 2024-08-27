package arrays;
public class maxsubarrsum {
    public static int maximumSumOfSubarray(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int currentsum = 0;
                for(int k=i;k<=j;k++){
                    currentsum+=arr[k];
                }
               System.out.println(currentsum);
                maxsum=Math.max(maxsum, currentsum);  
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        int ans = maximumSumOfSubarray(arr);
        System.out.println(ans);
    }
}
