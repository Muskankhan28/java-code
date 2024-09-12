package recrussions;
import java.util.*;

public class permutationofanarrayBruteApproach {

    // brute appraoch 

    public static void allpermutation( int arr[] , List<List<Integer>>ans , List<Integer>ds , boolean map[]){
        int n = arr.length;
        // base case
        // if the ds size become equall to the arr size in that case we will simply add our ds into the ans and return it 
        if(ds.size() == n){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<n;i++){
            if(map[i] == false){    // So this condition if (!map[i]) helps in ensuring that elements are used in a permutation only if they haven't been used yet, 
                map[i] = true;
                ds.add(arr[i]);
                allpermutation(arr, ans, ds, map);
                ds.remove(ds.size()-1);
                map[i] = false;
            }
        }
    }
    public static List<List<Integer>>permutations(int arr[]){
        int n = arr.length;
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>ds = new ArrayList<>(); 
        boolean map[] = new boolean[n];
        allpermutation(arr, ans, ds, map);
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        List<List<Integer>>result = permutations(arr);
        for (List<Integer> i : result) {
            System.out.print(i+ " ");
        }
    }
}
