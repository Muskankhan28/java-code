package bitmanipualation;

import java.util.*;

public class countpairsthatformacompleteday {

    public long countcompletepairs (int arr[]){
        int n = arr.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        Set<Integer>keys = map.keySet();
        for(Integer i : keys){
    
        }

    }

    public static void main(String[] args) {
        int arr[] = {12,12,30,24,24};
    }
}
//     public static int countpairs(int arr[]){
//         int n = arr.length;
//         int count = 0;
//         int sum = 0;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 sum = arr[i]+arr[j];
//                 if(sum % 24 == 0){
//                     count ++;
//                 }

//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         int arr[] = {72,48,24,3};
//         System.out.println(countpairs(arr));
//     }

// }

   
    
     
        
      



