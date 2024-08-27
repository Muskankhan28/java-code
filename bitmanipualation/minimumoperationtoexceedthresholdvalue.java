package bitmanipualation;


import java.util.*;
public class minimumoperationtoexceedthresholdvalue {
    public static int minoperation(int arr[] , int k){
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i] < k){
                count++;
            }
        }
        return count;
      

    }
    public static void main(String[] args) {
        int arr[] = {2,11,10,1,3};
        int k=10;
        System.out.println(minoperation(arr, k));
    }
  

    
}
