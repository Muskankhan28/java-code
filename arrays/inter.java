package arrays;
import java.util.*;

public class inter {
    public static int[] intersection(int nums1[] , int nums2[]){
        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        ArrayList<Integer>List = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                List.add(nums2[i]);
                set.remove(nums2[i]);

            }
        }
        int temp[] = new int[List.size()];
        for(int i=0;i<temp.length;i++){
            temp[i] = List.get(i);
        }
        return temp;
       
    }
    
    public static void main(String[] args) {
        int nums1[] = {1,2,2,1};
        int nums2[] = {2,2};
        int ans[] = intersection(nums1, nums2);
        for (int i : ans) {
            System.out.print(i + " ");
            
        }
    }
}
