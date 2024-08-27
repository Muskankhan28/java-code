package arrays;
import java.util.*;

public class unionoftwoarray {
    public static int[] union(int nums1[] , int nums2[]){
        int n = nums1.length;
        int m = nums2.length;
        int i=0;
        int j=0;
        ArrayList<Integer>list = new ArrayList<>();
        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                if(list.size()== 0 || list.get(list.size()-1) !=nums1[i]){
                    list.add(nums1[i]);
                }
                i++;
            }
            else{
                if(list.size()== 0 || list.get(list.size()-1) !=nums2[j]){
                    list.add(nums2[j]);
                }
                j++;
                
            }
        }
         
            while(i<n){
                if(list.get(list.size()-1) != nums1[i]){
                    list.add(nums1[i]); 
                }
                i++;
            }

            while(j<m){
                if(list.get(list.size()-1) != nums2[j]){
                    list.add(nums2[j]);
                }
                j++;
            }

            int temp[] = new int[list.size()];
            int a=0;
            for(int k=0;k<list.size();k++){
                temp[a] = list.get(k);
                a++;
            }
            return temp;
        }
    public static void main(String[] args) {
        int nums1[] = {1,1,2,3,4,5};
        int nums2[] = {2,3,4,4,5,6};
        int ans[] = union(nums1, nums2);
        for (int i : ans) {
            System.out.print( i + " ");
            
        }
    }
}


    // brute approach

//     public static int[] unionoftwoarrays(int nums1[] , int nums2[]){
//         HashSet<Integer>set = new HashSet<>();
//         for(int i=0;i<nums1.length;i++){
//             set.add(nums1[i]);
//         }
//         for(int i=0;i<nums2.length;i++){
//             set.add(nums2[i]);
//         }
//         int temp[] = new int[set.size()];
//         int j=0;
//         for (Integer i : set) {
//             temp[j] = i;
//             j++;
            
//         }
//         return temp;
       
//     }
//     public static void main(String[] args) {
//         int nums1[] = {1,1,2,3,4,5};
//         int nums2[] = {2,3,4,4,5,6};
//         int ans[] = unionoftwoarrays(nums1, nums2);
//         for (int i : ans) {
//             System.out.print( i + " ");
//         }
//     }
    
// }
