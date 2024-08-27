package bitmanipualation;
import java.util.*;

// BRUTE SOLUTION

public class twooddoccuring {
    public static void twooddoccrno(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
               
            }
           
          
        }
 
    }

    // BETTER SOLUTION



    public static void findtwoele(int arr[]){
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
        Set<