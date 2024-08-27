package arrays;
import java.util.*;
public class removeelement {
    public static int remove(int arr[] , int val){
        int n = arr.length;
        int i=0;
        int j=0;
        while(j<n){
            if(arr[j] != val){
                arr[i] = arr[j];
                i++;
            }
            j++;
        }
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(remove(arr, val));
       
       
    

    }
    
}
