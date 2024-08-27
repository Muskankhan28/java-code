package arrays;

public class mergetwosortedarrbrute {
    public static void mergetwosortedarray(int nums1[],int nums2[],int n, int m){
        int temp[] = new int[n+m];
        int k=0;
        int left=0;
        int right=0;
        while(left<n && right<m){
           
             if(nums1[left]<=nums2[right]){
                temp[k] = nums1[left];
                k++;
                left++;
            }
            else{
                temp[k] = nums2[right];
                k++;
                right++;
            }
        }
        while(right<m){
            temp[k] = nums2[right];
            k++;
            right++;
        }
        while(left<n){
            temp[k] = nums1[left];
            k++;
            left++;
        }
        // for (int u : temp) {
        //     System.out.print(u+ " ");
            
        // }
        // System.out.println();

        int j=0;
        for(int i=0;i<n;i++){
                nums1[i] = temp[j];
                j++;
        }
        for(int i=0;i<m;i++){
            nums2[i] = temp[j];
            j++;
        }
        for (int i : nums1) {
            System.out.print(i+" ");
            
        }
        System.out.println();
        for (int i : nums2) {
            System.out.print(i+ " ");
            
        }

        // int j=0;
        // for(int i=0;i<n+m;i++){
        //     if(i<n){
        //         nums1[i] = temp[j];
        //         j++;
        //     }
        //     else{
        //         nums2[i-n] = temp[j];
        //         j++;
        //     }
        // }
        // for (int i : nums1) {
        //     System.out.print(i+" ");
            
        // }
        // System.out.println();
        // for(int  i: nums2){
        //     System.out.print(i+" ");
        // }
    }
    
    public static void main(String[] args) {
        int arr[] = {1,3,5,7};
        int arr2[] = {0,2,6,8,9};
        int n = arr.length;
        int m=arr2.length;
        mergetwosortedarray(arr, arr2, n, m);
   
      
    }
    
}
