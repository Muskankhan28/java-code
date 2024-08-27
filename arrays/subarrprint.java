package arrays;

public class subarrprint {
    public static void printSubarray(int arr[]){
        int totalsubarray = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k] + " ");
                }
                totalsubarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total number of subarray ->" + totalsubarray);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printSubarray(arr);
    } 
}
