package arrays;

import java.util.*;

public class ques {
    public static int removeelement(int arr[] , int k){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != k){
                count++;
            }
        }
        return count;
        
    
       
    }
    public static void main(String[] args) {
        int arr[] = {3,2,2,3};
        int k = 3;
        System.out.println(removeelement(arr, k));
        
    }
    
}
