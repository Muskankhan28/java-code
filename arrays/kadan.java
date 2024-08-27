package arrays;

public class kadan {
    public static int findmaxSumUsingKadans(int arr[]){
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currentsum+=arr[i];
            if(currentsum<0){
                currentsum = 0;  
            }
            maxsum = Math.max(maxsum, currentsum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(findmaxSumUsingKadans(arr));
    }
    
}
