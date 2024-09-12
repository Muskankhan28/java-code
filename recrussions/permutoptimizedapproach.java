package recrussions;
import java.util.*;
public class permutoptimizedapproach {
    public static void printpermutations(int indx , int arr[] , List<List<Integer>>ans){
        int n = arr.length;
        if(indx == n){
            List<Integer>ds = new ArrayList<>();
            for(int i=0;i<n;i++){
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=indx ; i<n ; i++){
            swap(indx, i, arr);
            printpermutations(indx+1, arr, ans);
            swap(indx, i, arr);
        }
    }
    public static void swap(int i , int j , int arr[]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static List<List<Integer>>permute(int arr[]){
        List<List<Integer>>ans = new ArrayList<>();
        printpermutations(0, arr, ans);
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        List<List<Integer>> result = permute(arr);
        for (List<Integer> i : result) {
            System.out.print(i+ " ");
             
        }
    }   
}
