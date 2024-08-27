package arrays;

import java.util.Arrays;

public class quee {
    public static int  findmax(int arr[]){
        int n=arr.length;
        int result = Integer.MIN_VALUE;
        int i = 0;
        int j=1;
        while(j<n){
            int currentmax = (arr[i]-1)*(arr[j]-1);
            result = Math.max(result, currentmax);
            i++;
            j++;
        }
        return result;
       
    }
    
    
    public static void main(String[] args) {
        int arr[] = {3,2,4};
        System.out.println(findmax(arr));

       
    

    }
    
}   
