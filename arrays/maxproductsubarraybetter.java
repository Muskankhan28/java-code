package arrays;

public class maxproductsubarraybetter {
    public static int findmaxproductbetterappraoch(int arr[]){
        int n=arr.length;
        int maxproduct = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int currentproduct = 1;
            for(int j=i;j<n;j++){
                currentproduct = currentproduct*arr[j];
                maxproduct = Math.max(maxproduct, currentproduct);
            }
        }
        return maxproduct;
    }
    public static void main(String[] args) {
        int arr[] = { 2,3,-2,4};
        System.out.println(findmaxproductbetterappraoch(arr));
    }
}
