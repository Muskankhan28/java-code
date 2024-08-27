package arrays;

import java.util.Arrays;

public class longestconsectuivebetterapproach {

    // better approach 
    
    public static int findlongestconsecutive(int arr[]){
        int n = arr.length;
        int longest = 1;
        int count = 0;
        int lastsmaller = Integer.MIN_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]-1 == lastsmaller){
                count = count+1;
                lastsmaller = arr[i];
            }
            else if(arr[i] != lastsmaller){
                count = 1;
                lastsmaller = arr[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
   
    public static void main(String[] args) {
        int arr[] = {100,102,100,101,101,4,3,2,3,2,1,1,1,2};
        System.out.println(findlongestconsecutive(arr));
      
        
    }
    
}
