package arrays;
import java.util.*;

public class leaderoptimized {
    
    // optimized approach 
    
    public static ArrayList<Integer>findLeader(int arr[]){
        int n=arr.length;
        ArrayList<Integer>list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i] > max){
                list.add(arr[i]);
                max = arr[i];
            }
        }
        int start = 0;
        int end = list.size()-1;
        while(start<=end){
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;

        }
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {10,22,12,3,0,6};
        ArrayList<Integer>ans = findLeader(arr);
        for (Integer i : ans) {
            System.out.print(i + " ");
            
        }
    }
    
}
