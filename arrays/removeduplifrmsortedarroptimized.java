package arrays;

public class removeduplifrmsortedarroptimized {
    public static int  removedupli(int arr[]){
        int n=arr.length;
        int i=0;
        int j=i+1;
        while(j<n){
            if(arr[i] == arr[j]){
                j++;
            }
            else {
                i++;
                arr[i] = arr[j];
            }
            
        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removedupli(arr));
    }
    
}
