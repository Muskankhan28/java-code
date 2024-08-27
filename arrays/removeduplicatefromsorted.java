package arrays;
import java.util.*;

public class removeduplicatefromsorted {
    // brute appraoch
    public static int removeduplicate (int arr[]){
        int n=arr.length;
        int j=0;
        
        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        for(Integer i : set){
            arr[j] = i;
            j++;
        }
        return set.size();

    
    }
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,3,4};
        System.out.println(removeduplicate(arr));
        
    
    }
    
}
