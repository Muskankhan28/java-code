package arrays;

public class maxproductofsubarroptimized {
    public static int findmaxproduct(int arr[]){
        int n=arr.length;
        int maxproduct =Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        for(int i=0;i<n;i++){
            if(prefix  == 0){
                prefix = 1;
            }
            if(suffix == 0){
                suffix = 1;
            }
            prefix = prefix*arr[i];
            suffix = suffix*arr[n-i-1];
            maxproduct = Math.max(maxproduct,Math.max(prefix, suffix));
        }
        return maxproduct;
    }
    public static void main(String[] args) {
        int arr[] = {-2,3,4,-1,0,-2,3,1,4,0,4,6,-1,4};
        System.out.println(findmaxproduct(arr));
    }
    
}
