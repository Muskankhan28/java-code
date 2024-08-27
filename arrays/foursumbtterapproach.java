package arrays;
import java.util.*;

public class foursumbtterapproach {
    public static List<List<Integer>>foursum(int arr[] , int target){
        int n=arr.length;
        HashSet<List<Integer>>set = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                HashSet<Integer>set1 = new HashSet<>();
                for(int k=j+1;k<n;k++){
                    int sum = arr[i]+arr[j]+arr[k];
                    int fourthno = target - sum;
                    if(set1.contains(fourthno)){
                        List<Integer>list = Arrays.asList(arr[i],arr[j],arr[k],fourthno);
                        Collections.sort(list);
                        set.add(list);
                    }
                    else{
                        set1.add(arr[k]);
                    }
                }
            }
        }
        List<List<Integer>>ans = new ArrayList<>(set);
        return ans;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,0,-1,-2,2,0};
        int target = 0;
        List<List<Integer>>answer = foursum(arr, target);
        for(List<Integer> i : answer){
            System.out.print(i+ " ");
        }
      
    }
    
}
