package arrays;

public class consecutiveones {
    
    public static void main(String[] args) {
        int arr[] = {1,1,0,0,1,1,1,0,0,1};
        int n=arr.length;
        int j=0;
        int count = 0;
        int max = 0;
        while(j<n){
            if(arr[j] == 1){
                count++;
                j++;
            }
            else if (arr[j] != 1){
                count = 0;
                j++;
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}


