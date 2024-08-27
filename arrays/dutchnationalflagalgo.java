package arrays;

public class dutchnationalflagalgo {

    public static int [] sortarr(int arr[]){
        int n=arr.length;
        int low=0;
        int mid=0;
        int high = n-1;
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
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,1,0,1,2,1,2,0,0,0};
        int ans[] = sortarr(arr);
        for (int i : ans) {
            System.out.print(i+ " ");
            
        }
        
    }
   
    
}
