package arrays;
import java.util.*;

public class lefrotate {
    public static void reverse(int arr[] , int n,int d){
        
        int i = 0;
        int j = arr.length-1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void leftrotate(int arr[] , int d, int n){
        reverse(arr, 0, -1);
        reverse(arr, d, n);
        reverse(arr, 0, n);
     
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int d = 3;
        int n = arr.length;
        leftrotate(arr, d, n);

        for (int i : arr) {
            System.out.print(i+ " ");
            
        }
        
    }

    



    // brute approach 
    // public static void main(String[] args) {
    //     int arr[] = {1,2,3,4,5,6,7};
    //     int n=7;
    //     int d = 3;
    //     int temp[] = new int[d];
    //     for(int i=0;i<d;i++){
    //         temp[i] = arr[i];
    //     }
    //     for(int i=d;i<arr.length;i++){
    //         arr[i-d] = arr[i];
    //     }
    //     for(int i=n-d;i<arr.length;i++){
    //         arr[i] = temp[i-(n-d)];
    //     }
    //     for (int i : arr) {
    //         System.out.print(i+ " ");
            
    //     }

    // }







    // public static void main(String[] args) {
    //     int arr[]= { 1,2,3,4,5};
    //     int temp = arr[0];
    //     for(int i=1;i<arr.length;i++){
    //         arr[i-1] = arr[i];
    //     }
    //     arr[arr.length-1] = temp;
    //     for (int i : arr) {
    //         System.out.print(i + "  ");
            
    //     }
    // }
    
}
