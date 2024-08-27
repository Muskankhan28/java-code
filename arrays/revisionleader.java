package arrays;
import java.util.*;

public class revisionleader {
    public static ArrayList<Integer>majorityelemenst(int arr[]){
        int n = arr.length;
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=i;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
                if(count > n/3){
                    list.add(arr[i]);

                }
                if(list.size() == 2){
                    break;
                }
             
            }
            
        }
        return list;

    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,3,3,2,2,2};
        ArrayList<Integer>ans = new ArrayList<>();
        for(Integer i : ans){
            System.out.print(i+ " ");
        }
    }
}


    // public static int longest(int arr[]){
    //     int n= arr.length;
    //     int longest = 1;
    //     HashSet<Integer>set = new HashSet<>();
    //     for(int i=0;i<n;i++){
    //         set.add(arr[i]);
    //     }
    //     for(Integer i : set){
           
    //         if(!set.contains(i-1)){
    //             int x = i;
    //             int count = 1;
    //             while(set.contains(x+1)){
    //                 x=x+1;
                 
    //                 count=count+1;

    //             }
    //             longest = Math.max(count, longest);
    //         }
          
    //     }
    //     return longest;
    // }






    // public static int longestconsecutive(int arr[]){
    //     int n = arr.length;
    //     int longest = 1;
    //     int count = 0;
    //     int lastsmaller = Integer.MIN_VALUE;
    //     Arrays.sort(arr);
    //     for(int i=0;i<n;i++){
    //         if(arr[i]-1 == lastsmaller){
    //             count = count+1;
    //             lastsmaller = arr[i];
    //         }
    //         else if(arr[i] != lastsmaller){
    //             count = 1;
    //             lastsmaller = arr[i];
    //         }
    //         longest = Math.max(longest, count);
    //     }
    //     return longest;

    // }
    
//     public static void main(String[] args) {
//         int arr[] = {102,4,100,1,101,3,2,1,1};
//         System.out.println(longest(arr));
//         // System.out.println(longestconsecutive(arr));
      
//     }
// }

    