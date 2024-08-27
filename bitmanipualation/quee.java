package bitmanipualation;

import java.util.*;

public class quee {
    public static void findele(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(arr[i] == arr[j]){
                    count ++;
                }
               
            }
            if(count%2 != 0){
                System.out.println(arr[i] + " ");
            }
        }
    }
    

    public static void main(String[] args) {
        int arr[] = {4,4,3,2,2,4,4,7};
        findele(arr);
  
    }
    // public static int findeleapprone(int arr[]){
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



    // public static void findele(int arr[]){
    //     int n =arr.length;
    //     HashMap<Integer,Integer>map = new HashMap<>();
    //     for(int i=0;i<n;i++){
    //         if(map.containsKey(arr[i])){
    //             map.put(arr[i], map.get(arr[i])+1);
    //         }
    //         else{
    //             map.put(arr[i], 1);
    //         }
    //     }
    //     Set<Integer>keys = map.keySet();
    //     for(Integer i : keys){
    //         if(map.get(i) %2 != 0){
    //             System.out.println(i);
    //         }
    //     }
        
    // }


    // public static int findeleone(int arr[]){
    //     int n = arr.length;
    //     int xor = 0;
    //     for(int i=0;i<n;i++){
    //         xor = xor ^ arr[i];
    //     }
    //     return xor;
    // }
    // public static void main(String[] args) {
    //     int arr[] = {4,3,4,4,4,5,5};
    //     // System.out.println(findeleapprone(arr));
    //     // findele(arr);
    //     System.out.println(findeleone(arr));
    // }
    
}
