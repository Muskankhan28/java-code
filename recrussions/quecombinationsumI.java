package recrussions;
import java.util.*;

public class quecombinationsumI {
    public static void findcombinations(int indx , int arr[] , int target , List<List<Integer>>ans , List<Integer>ds){
        int n = arr.length;
        if(indx>=n){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        // pick case 
        if(arr[indx] <= target){
            ds.add(arr[indx]);
            findcombinations(indx, arr, target-arr[indx], ans, ds);
            ds.remove(ds.size()-1);
        }
        // not pick
        findcombinations(indx+1, arr, target, ans, ds);
    }

    public static List<List<Integer>>combinationsumI(int arr[] , int target){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer>ds = new ArrayList<>();
        findcombinations(0, arr, target, ans, ds);
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,6,7};
        int target = 7;
        List<List<Integer>> result = combinationsumI(arr, target);
        for (List<Integer> i : result) {
            System.out.println(i);
            
        }
    }
    
}
