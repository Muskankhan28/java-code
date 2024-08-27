package arrays;

public class sortcolors {
    public static void sortcolors(int arr[]){
        int n = arr.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
    }
    
}
