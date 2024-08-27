package bitmanipualation;
import java.util.*;

public class powerset {
    public static List<List<Integer>>subsets(int nums[]){
        int n = nums.length;
        List<List<Integer>>ans = new ArrayList<>();   
        int totalsubset = 1<<n;
        for(int i=0;i<totalsubset;i++){
            List<Integer>list = new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j) )!= 0){
                    list.add(nums[j]);
                }
            }
            ans.add(list);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        List<List<Integer>>sol = subsets(arr);
        for (List<Integer> i : sol) {
            System.out.println(i);
        }
    }
}
