
package recrussions;
import java.util.*;

public class subsequence {


    // print all the susequences whose sum equalls to the target using recussion

    public static void subsequences(int indx , int arr[] , ArrayList<Integer>list , int sum , int target ){
        int n = arr.length;
        if (indx == n) {
            if(target == sum){
                System.out.println(new ArrayList<>(list));
            }
            return;  
        }
        // take
        list.add(arr[indx]);
      
        subsequences(indx+1, arr, list, sum+arr[indx] , target);
        list.remove(list.size()-1);
        // not take
        subsequences(indx+1, arr, list, sum, target);
    }


    // print any one subsequence whose sum is equall to the target 

    public static boolean onesubsequence(int indx , int arr[] , ArrayList<Integer>list , int sum , int target){
        int n = arr.length;
        if(indx == n){
            // condition satisfied
            if(sum == target){
                System.out.println(list);
                return true;
            }
            return false;
        }
        list.add(arr[indx]);
        sum = sum+arr[indx];
        if(onesubsequence(indx+1, arr, list, sum, target) == true){
            return true;
        }
        sum=sum-arr[indx];
        list.remove(list.size()-1);
        if(onesubsequence(indx+1, arr, list, sum, target) == true){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,1};
        ArrayList<Integer>list = new ArrayList<>();
        // subsequences(0, arr, list, 0, 2);
        System.out.println(onesubsequence(0, arr, list, 0, 2));
    }
    
}
