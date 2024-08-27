package arrays;

import java.util.Arrays;

public class mergetwosortedarrays {
    public static void mergetwoarrays(int arr1[] , int arr2[] , int n , int m){
        int left = n-1;
        int right = 0;
        while(left >= 0 && right<m){
            if(arr1[left]>arr2[right]){
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] =  temp;
                left--;
                right++ ;
            }
            else{
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
      

    }
    public static void main(String[] args) {
        int arr1 [] = {1,3,5,7};
        int arr2 [] = {0,2,6,8,9};
        int n = arr1.length;
        int m = arr2.length;
        mergetwoarrays(arr1, arr2, n, m);
        for (int i : arr1) {
            System.out.print(i+ " ");
            
        }
        System.out.println();
        for (int i : arr2) {
            {
                System.out.print(i+ " ");
            }
        }
   
      

    }
    
}
