package arrays.slidingwindows;

public class maximumsumofsubarr {

    // brute approach for finding maxsum of subarray of size k
    // time complexity - O(N^2)
    public static int calmaxsum(int arr[] , int k){
        int n = arr.length;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<n-k+1;i++){
            int currentsum = 0;
            for(int j=i;j<i+k;j++){
                currentsum += arr[j];
            }
            maxsum = Math.max(maxsum, currentsum);
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int arr[] = {5,2,-1,0,3};
        int k=4;
        System.out.println(calmaxsum(arr, k));
    }
    
}
