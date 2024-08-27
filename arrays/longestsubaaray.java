package arrays;

public class longestsubaaray {


    public static int longestsubarray(int arr[] , int m){
        int n = arr.length;
        int len = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    
                }
                // System.out.println(sum);
                if(sum == m){
                    len = Math.max(len , j-i+1);
                }
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,1,1,4,2,3};
        int m = 3;
        System.out.println(longestsubarray(arr, m));
      
        
    }
}
