package arrays;
import java.util.*;

public class threesumbetter {
    public static List<List<Integer>>threesum(int arr[]){
        int n=arr.length;
        HashSet<List<Integer>>set = new HashSet<>();
        for(int i=0;i<n;i++){
            HashSet<Integer>set1 = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int thirdno = -(arr[i]+arr[j]);
                if(set1.contains(thirdno)){
                    List<Integer>list = Arrays.asList(arr[i],arr[j],thirdno);
                    list  .sort(null);
                    set.add(list);

                }
                set1.add(arr[j]);
            }
            
        }
        List<List<Integer>>ans = new ArrayList<>(set);
        return ans;

    }
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,4};
        List<List<Integer>>answer = threesum(nums);
        for(List<Integer> i: answer){
            System.out.print(i+ " ");
        }
     
    }
    
}
