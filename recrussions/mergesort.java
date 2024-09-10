package recrussions;
import java.util.*;
public class mergesort {

    public static void Merge(int arr[], int low, int mid, int high){
        ArrayList<Integer>temp = new ArrayList<>();   // cretated a temporary array
        int left = low;                               //starting indedx of left half of an array
        int right = mid+1;                            // starting infdex of right half of an array
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }

        }

        // if elements on the left half still left
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        // if elements on the right half still left
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        // putting the element from the temp array to the originall array 
        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }
    }

    public static void MergeSort(int arr[] , int low , int high){
        if(low >= high){
            return;
        }
        int mid = (low+high)/2;
        MergeSort(arr, 0, mid);      // left half
        MergeSort(arr, mid+1, high);     // right half
        Merge(arr,low,mid,high);         // merging sorted half
    }

    public static void main(String[] args) {
        int arr[] = {3,1,2,4,1,5,2,6,4};
        int n = arr.length;
        MergeSort(arr, 0, n-1);
        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }
}
