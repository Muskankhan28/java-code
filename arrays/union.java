package arrays;
import java.util.*;

public class union {
    public static void main(String[] args) {
        int arr[] = {7,3,9};
        int num[] = {6,3,9,2,9,4};

       
        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int i=0;i<num.length;i++){
            set.add(num[i]);
        }
        System.out.println(set.size());
        System.out.println(set);
        
    }
    
}
