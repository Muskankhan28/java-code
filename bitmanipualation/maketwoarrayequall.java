package bitmanipualation;

import java.util.Arrays;

public class maketwoarrayequall {
    public static boolean canbeequal(int target[] , int arr[]){
        Arrays.sort(target);
        Arrays.sort(arr);
        int n = arr.length;
        if(target.length != arr.length){
            return false;
        }
        for(int i=0;i<n;i++){
            if(arr[i] != target[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int target[] = {3,7,9};
        int arr[] = {3,7,11};
        System.out.println(canbeequal(target, arr));

       
        

        // int n = target.length;
        // int start = 0;
        // int end = target.length-1;
        // while(start<=end){
        //     int tem = target[start] ;
        //     target[start] = target[end];
        //     target[end] = tem;
        //     start++;
        //     end--;
        //  }
        //  for (int i : target) {
        //     System.out.print(i+ " ");
            
        //  }
    }
    
}
