package recrussions;
import java.util.*;

public class subsetsumIIrecurrsion {
    public static void subsetsumII(int indx ,int arr[], List<Integer>ds ,List<List<Integer>>ans){
        ans.add(new ArrayList<>(ds));
        int n=arr.length;
        for(int i=indx;i<n;i++){
            if(i!=indx && arr[i] == arr[i-1]){
                continue;
            }
            ds.add(arr[i]);
            subsetsumII(i+1, arr, ds, ans);
            ds.remove(ds.size()-1);
        }
    }

    public static List<List<Integer>>subsetswithoutdupluicates(int arr[]){
        Arrays.sort(arr);
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>ds = new ArrayList<>();
        subsetsumII(0, arr, ds, ans);
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2};
        int n = arr.length;
        List<List<Integer>>result = subsetswithoutdupluicates(arr);
        for (List<Integer> i : result) {
            System.out.print(i);
            
        }

    }
    
}
