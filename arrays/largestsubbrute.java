package arrays;

public class largestsubbrute {

    public static int largest(int arr[] , int n){
        int len = 0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];

            if(sum == n){
                len = Math.max(len,j-i+1);
            }
        }
    }
        return len;
 }
    


    public static int largestsubaaray(int arr[] , int n){
        int len=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum == n){
                    len = Math.max(len,j-i+1);
                }
            }
        }
        return len;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,1,1,4,2,3};
        int n=3;
        // System.out.println(largestsubaaray(arr, n));
        System.err.println(largest(arr, n));
  
    
    }
    
}
