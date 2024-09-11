package recrussions;
import java.util.*;

public class subsetsumrecurrsion {

    public static void sumofsubsets(int indx , int sum ,ArrayList<Integer>arr, int n , ArrayList<Integer>ans){
        if(indx == n){
            ans.add(sum);
            return;
        }
        // pick the element
        sumofsubsets(indx+1, sum+arr.get(indx), arr, n, ans);
        // not pick the element
        sumofsubsets(indx+1, sum, arr, n, ans);
    }
    public static ArrayList<Integer>subset(ArrayList<Integer>list , int n){
        ArrayList<Integer>ans = new ArrayList<>();
        sumofsubsets(0, 0, list, n, ans);
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {3,1,2};
        int n = nums.length;
        ArrayList<Integer>arr = new ArrayList<>();
        for(int i:nums){
            arr.add(i);
        }
        ArrayList<Integer>result = subset(arr, n);
        System.out.println(result);
    } 
}
