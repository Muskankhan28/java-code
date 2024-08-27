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
            if(count % 2 != 0){
                System.out.print(arr[i] + " ");
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
        Set<Integer>keys = map.keySet();
        for(Integer i : keys){
            if(map.get(i) %2 !=0){
                System.out.print(i+ " ");
            }
        }
    }



    // OPTIMIZED APPROACH


    public static void findele(int arr[]){
        int n = arr.length;
        int x = arr[0];
        for(int i=1;i<n;i++){
            x = x^arr[i];
        }
        int k = (x&(~(x-1)));
        int ele1 = 0;
        int ele2 = 0;
        for(int i=0;i<n;i++){
            if((arr[i] & k) != 0){
                ele1 = ele1 ^ arr[i];
            }
            else{
                ele2 = ele2 ^ arr[i];
            }
        }
        System.out.print(ele1 +" , "+ ele2 + "  ");
    }


    public static void main(String[] args) {
        int n = 13;
        while(n>0){
            
        }

        // int arr[] = {4,4,3,2,2,4,4,7};
        // // twooddoccrno(arr);
        // findtwoele(arr);
        // findele(arr);
    
    
  
    }
    
}
