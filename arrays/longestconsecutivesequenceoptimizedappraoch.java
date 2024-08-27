package arrays;
import java.util.*;

public class longestconsecutivesequenceoptimizedappraoch {
    public static int longestconsecutive(int arr[]){
        int n = arr.length;
        if(n==0){
            return 0;
        }
        int longest = 1;
        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        for(Integer i : set){
            if(!set.contains(i-1)){
                int x = i;
                int count = 1;

                while(set.contains(x+1)){
                    x=x+1;
                    count = count+1;
                }
                longest = Math.max(count, longest);
            }

        }
        return longest;
    }
public static void main(String[] args) {
    int arr[] = {102,4,100,1,101,3,2,1,1};
    System.out.println(longestconsecutive(arr));
}
    
}
