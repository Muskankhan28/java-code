package arrays;

public class preffixsumoptimizedapproach {
    public static int equillibriumpoint(int arr[]){
        int n = arr.length;
        int totalsum = 0;
        int leftsum = 0;
        for(int i=0;i<n;i++){
            totalsum+=arr[i];
        }
        for(int i=0;i<n;i++){
            int rightsum = totalsum-leftsum-arr[i];
            if(leftsum == rightsum){
                return i;
            }
            leftsum+=arr[i];

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,7,3,6,5,6};
        System.out.println(equillibriumpoint(arr));
    }
    
}
