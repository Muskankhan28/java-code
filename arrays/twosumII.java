package arrays;

public class twosumII {

    // wihtout using extra space

    public static int [] twosum(int arr[] , int target) {
        int n = arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int sum = arr[i] + arr[j];
            if(sum>target){
                j--;
            }
            else if(sum<target){
                i++;
            }
            else{
               int result[] = {i+1,j+1};
               return result;
            }
        }
        return new int[]{};
 
        
    }
    // public static int[] twosum(int arr[], int target){
    //     int n = arr.length;
    //     int temp[] = new int[2];
       
    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             if(arr[i]+arr[j] == target){
    //                 temp[0] = i+1;
    //                 temp[1] = j+1;

    //             }
    //         }
    //     }
    //     return temp;
    // }
    
    public static void main(String[] args) {
        int arr[] = {2,3,4};
        int target = 6;
        int ans[] = twosum(arr, target);
        for (int i : ans) {
            System.out.print(i+ " ");
            
        }
    }
}
