package recrussions;
import java.util.*;

public class quecombinationsumII {
    public static void findcombinations(int indx , int arr[] , int target, List<List<Integer>>ans ,List<Integer>ds){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        int n = arr.length;
        for(int i=indx;i<n;i++){
            if(i>indx && arr[i] == arr[i-1]){
                continue;
            }
            if(arr[i] > target){
                break;
            }
            ds.add(arr[i]);
            findcombinations(i+1, arr, target-arr[i], ans, ds);
            ds.remove(ds.size()-1);
        }
        
    }
    public static List<List<Integer>>combinationsum2(int arr[] , int target){
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>ds = new ArrayList<>();
        Arrays.sort(arr);
        findcombinations(0, arr, target, ans, ds);
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2};
        int target = 4;
        List<List<Integer>> result = combinationsum2(arr, target);
        for (List<Integer> i : result) {
            System.out.println(i);
            
        }
    }
    
}
