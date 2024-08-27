package arrays;
import java.util.*;

public class findtheduplicareno {
    public static int finddupliusingpointers(int arr[]){
        int n=arr.length;
        int i=0;
        int j=i+1;
        Arrays.sort(arr);
        while(j<n){
            if(arr[i] != arr[j]){
                i++;
                j++;
            }
            else{
                break;
            }
        }
        return arr[i];
    }

    
    // public static int finddupli(int arr[]){
    //     int n=arr.length;
        
    //     HashMap<Integer,Integer>map = new HashMap<>();
    //     for(int i=0;i<n;i++){
    //         if(map.containsKey(arr[i])){
    //             map.put(arr[i],map.get(arr[i])+1);
    //         }
    //         else{
    //             map.put(arr[i],1);
    //         }
    //     }
     
    //     Set<Integer>key = map.keySet();
    //     for(Integer i : key){
    //         if(map.get(i) >= 2){
    //             return i;
               
                 
    //         }
    //     }
    //     return -1;
    // }
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,2};
        // System.out.println(finddupli(arr));
        System.out.println(finddupliusingpointers(arr));
  
     
    }
    
}
