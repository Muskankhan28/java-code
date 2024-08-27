package arrays;
import java.util.*;

public class majorityelement {

    // brute force approach for finding majority element in an array 
    // 0(n^2)
    public static int majority(int arr[],int n){
        for(int i=0;i<arr.length;i++){
            int count = 0 ;
            for(int j=i;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
        
            }
            if(count>n/2){
                return arr[i];
            }
        }
        return -1;
        
        
    }
    public static void main(String[] args) {
        int arr[] = {2,2,3,3,1,2,2};
        int n=7;
        // System.out.println(majority(arr, n));

        // optimized approach using hashmap
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i