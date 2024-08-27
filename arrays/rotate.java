package arrays;

public class revision {
    public static int[] rearrange(int arr[]){
        int n=arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            count++;
        }
        int temp[] = new int[count];
     
        int pos = 0;
        int neg = 1;
        for(int i=0;i<n;i++){
            if(arr[pos]>0){
                temp[pos] = arr[i];
                pos = neg+1;

            }
            else{
                temp[neg] = arr[i];
                neg = pos+1;
            }
        }
        return arr;
       

    }
    //     int count = 0;
    //     int count1 = 0;
    //     for(int i=0;i<n;i++){
    //         if(arr[i]