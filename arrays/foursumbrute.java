package arrays;
import java.util.*;

public class foursumbrute {
    public static List<List<Integer>> foursum(int arr[],int target){
        int n=arr.length;
        HashSet<List<Integer>>set = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        long sum = (long) arr[i]+arr[j]+arr[k]+arr[l];
                        if(sum == target){
                            List<Integer>list = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
                            Collections.sort(list);
                            set.add(list);
                        }
                       
                    }
                }
            }
        }
        List<List<Integer>>ans = new ArrayList<>(set);
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>>at= foursum(arr, target);
        for(List<Integer> i : at){
            System.out.print(i+ " ");

        }
    }



    // public static List<List<Integer>>threesum(int arr[]){
    //     int n=arr.length;
    //     HashSet<List<Integer>>set = new HashSet<>();
    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             for(int k=j+1;k<n;k++){
    //                 if(arr[i]+arr[j]+arr[k]==0){
    //                     List<Integer>list= Arrays.asList(arr[i],arr[j],arr[k]);
    //                     list.sort(null);
    //                     set.add(list);
    //                 }
    //             }
    //         }
    //     }
    //     List<List<Integer>>ans = new ArrayList<>(set);
    //     return ans;
        
    // }
    // public static void main(String[] args) {
    //     int arr[] = {-1,0,1,2,-1,4};
    //     List<List<Integer>>answer = threesum(arr);
    //     for(List<Integer> i : answer){
    //         System.out.print(i+ " ");
    //     }

    // }
    
}
