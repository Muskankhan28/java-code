package arrays;

public class preffixsummm {

   


    public static int equillibriumpoint(int arr[]){
        int n = arr.length;
        int start = 0;
        int end = arr.length-1;
        int leftsum = 0;
        int rightsum = 0;
        while(start<=end){
            leftsum += arr[start];
            rightsum += arr[end];
            start++;
            end--;
            if(leftsum == rightsum){
                return start;
            }
        }
        return -1;
    }

    // BRUTE APPRAOCH 0(N2)

    public static int equillibriumpoint(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int leftsum = 0;
            for(int l=0;l<i;l++){
                leftsum +=arr[l];
            }
            int rightsum = 0;
            for(int r=i+1;r<n;r++){
                rightsum += arr[r];
            }
            if(leftsum == rightsum){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {1,7,3,6,5,6};
        System.out.println(equillibriumpoint(arr));
        // System.out.println(equillibriumpoint(arr));
    }
    
}
