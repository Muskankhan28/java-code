package arrays;

import java.util.Arrays;

public class threesumclosest {
    public static int threesumclose(int arr[],int target){
        int n=arr.length;
        int closestsum = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(i!=0 && arr[i] == arr[i-1]){
                continue;
            }
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(Math.abs(target-sum)  < Math.abs(target-closestsum)){
                    closestsum = sum;

                }
                if(sum<target){
                    j++;
                }
                else if(sum>target){
                    k--;
                }
                else if(sum == target){
                    return target;
                }
              
            }
        }
        return closestsum;
    }
    public static void main(String[] args) {
        int arr[] = { -1,2,1,4};
        int target = 1;
        System.out.println(threesumclose(arr, target));
    
    }
    
}
