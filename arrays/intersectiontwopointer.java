package arrays;

import java.util.ArrayList;

public class intersectiontwopointer {
    public static int[] intersection(int  nums1[] , int nums2[]){
        int n = nums1.length;
        int m = nums2.length;
        int i=0;
        int j=0;
        ArrayList<Integer>list=new ArrayList<>();
        while(i<n && j< m){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if (nums2[j]<nums1[i]){
                j++;
            }
            else{
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int temp[] = new int[list.size()];
        int a =0;
        for(int k=0;k<list.size();k++){
            temp[a] = list.get(k);
            a++;
        }
        return temp;
    }
    public static void main(String[] args) {
        int nums1[] = {1,2,2,3,3,4,5,1};
        int nums2[] = {2,3,3,5,6,6,7};
        int ans[] = intersection(nums1, nums2);
        for (int i : ans) {
            System.out.print(i+ " ");
            
        }
    }
    
}
