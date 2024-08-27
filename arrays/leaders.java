package arrays;
import java.util.*;

public class leaders {
    // brute approach 
    public static ArrayList<Integer>Leaders(int arr[]){
        ArrayList<Integer>List = new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            boolean leader = true;
            for(int j=i+1;j<n;j++){
                if(arr[j] > arr[i]){
                    leader = false;
                    break;
                }
            }
            if(leader == true){
                List.add(arr[i]);
            }
        }
        return List;
    }
    public static void main(String[] args) {
        int arr[] = {10,22,12,3,0,6};
        ArrayList<Integer>ans = Leaders(arr);
        for (Integer i : ans) {
            System.out.print(i+ " ");   
        }
    }
    
}
