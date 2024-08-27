package arrays;

import java.util.Arrays;

public class sortbrute {
    public static int[] sort(int arr[]){
        Arrays.sort(arr);
        return arr;

       
    }
    public static void main(String[] args) {
        int arr[] = {0,1,1,0,1,2,1,2,0,0,0};
        int ans[] = sort(arr);
        for (int i : ans) {
            System.out.print(i+ " ");
            
        }
        
    }
    
}
