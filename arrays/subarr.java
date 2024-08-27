package arrays;

import java.util.*;

public class subarr {

    // Brute force approach 
    // time complexity O(N^3)
    
    // public static int subarraysumeqltok(int arr[] , int n){
    //     int count = 0;
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i;j<arr.length;j++){
    //             int sum=0;
    //             for(int k=i;k<=j;k++){
    //                 sum+=arr[k];
    //             }
    //             if(sum == n){
    //                 count ++;
    //             }
    //         }
    //     }
    //     return count;
    // }

    // better approach
    // time complexity 0(N^2)

    // public static int subarray(int arr[],int n){
    //     int count = 0;
    //     for(int i=0;i<arr.length;i++){
    //         int sum = 0;
    //         for(int j=i;j<arr.length;j++){
    //             sum+=arr[j];
    //             if(sum == n){
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }



    public static void main(String[] args) {
        int arr[] = {1,2,3,-3,1,1,1,4,2,-3};
        int k=3;
        // System.out.println(subarraysumeqltok(arr, n));
        // System.out.println(subarray(arr, n));


        // optimized approach using hashmap
        // time complexity O(N)

        int sum = 0;
        int count = 0;
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            if(map.containsKey(sum)){
                map.put(sum, map.get(sum)+1);
            }
            else{
                map.put(sum, 1);
            }
        }
        System.out.println(count);

    }
}
