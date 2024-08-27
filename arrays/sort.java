package arrays;

import java.util.Arrays;

public class sort {
    public static int[] sort(int arr[]){
        int n=arr.length;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                count0++;
            }
            else if(arr[i] == 1){
                count1++;
            }
            else{
                count2++;
            }
        }
        for(int i=0;i<count0;i++){
            arr[i] = 0;
        }
        for(int i=count0;i<n-count2;i++){
            arr[i] = 1;
        }
        for(int i=count0+count1;i<n;i++){
            arr[i] = 2;
        }
        return arr;

    }
    
    public static void main(String[] args) {
        int arr[] = {0,1,2,0,1,2,1,2,0,0,0,1};

        // Arrays.sort(arr);
        // for (int i : arr) {
        //     System.out.print(i+ " ");
            
        // }
        
        int ans[] = sort(arr);
        for (int i : ans) {
            System.out.print(i+ " ");
            
        }

    }
    
}
