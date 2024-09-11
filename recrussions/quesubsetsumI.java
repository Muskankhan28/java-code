package recrussions;
import java.util.*;

public class quesubsetsumI {
    public static void sumofallsubsets(int indx , int sum ,int n, ArrayList<Integer>subsetsum , ArrayList<Integer>newlist){
        if(indx == n){
            subsetsum.add(sum);
            return;
        }
        // pick the element 
        sumofallsubsets(indx+1, sum+newlist.get((indx)), n, subsetsum, newlist);

        // donot pick the element 
        sumofallsubsets(indx+1, sum, n, subsetsum, newlist);
    }
    public static ArrayList<Integer>subsetsum(ArrayList<Integer>newlist , int n){
        ArrayList<Integer>ans = new ArrayList<>();
        sumofallsubsets(0, 0, n, ans, newlist);
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3,1,2};
        int n = arr.length;
        ArrayList<Integer>newlist = new ArrayList<>();
        for(int i: arr){
            newlist.add(i);
        }
        ArrayList<Integer>result = subsetsum(newlist, n);
        System.out.println(result);
    }
}
