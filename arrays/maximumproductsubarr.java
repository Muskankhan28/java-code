package arrays;

public class maximumproductsubarr {
    public static int findmaxproductbruteappraoch(int arr[]){
        int n=arr.length;
        int maxproduct = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int currentproduct = 1;
                for(int k=i;k<=j;k++){
                    currentproduct=currentproduct*arr[k];
                }
                maxproduct = Math.max(maxproduct, currentproduct);
            }
            
        }
        return maxproduct;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,-2,4};
        System.out.println(findmaxproductbruteappraoch(arr));
        
    }
    
    
}
