package arrays;
import java.util.*;


public class intersection {
    public static void main(String[] args) {
        int arr[] = {7,3,9};
        int nums[] = {6,3,9,2,9,4};
        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                count++;
                set.remove(nums[i]);
            }
        }
        System.out.println(count);

    }
    
}
