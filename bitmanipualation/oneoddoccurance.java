package bitmanipualation;
import java.util.*;
public class oneoddoccurance {


    // OPTIMIZED APPROACH

    // public static int findeleappearone(int arr[]){
    //     int n = arr.length;
    //     int xor = 0;
    //     for(int i=0;i<n;i++){
    //         xor = xor ^ arr[i];
    //     }
    //     return xor;
    // }





    // BETTER APPROACH



    public static void findelement(int arr[]){
    int n = arr.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        Set<Integer>keys = map.keySet();
        for(Integer i : keys){
            if(map.get(i) %2 != 0){
                System.out.println(i);
            }
        }

    }



    // BRUTE APPROACH



    // public static int findelementthatappearsonetime(int arr[]){
    //     int n = arr.length;
    //     for(int i=0;i<n;i++){
    //         int count = 0;
    //         for(int j=0;j<n;j++){
    //             if(arr[i] == arr[j]){
    //                 count ++;
    //             }
    //         }
    //         if(count % 2 != 0){
    //             return arr[i];
    //         }
    //     }
    //     return -1;
    // }
    public static void main(String[] args) {
        int arr[] = {7,3,7,7,7};
        // System.out.println(findelementthatappearsonetime(arr));
       
        findelement(arr);

        // System.out.println(findeleappearone(arr));
       
    }
    
}
