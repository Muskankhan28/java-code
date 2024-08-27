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
    //         if(arr[i]>0){
    //             count++;
    //         }
    //         else{
    //             count1++;
    //         }
    //     }
    //     int temp[] = new int[count];
    //     int j=0;
    //     int temp1[] = new int[count1];
    //     int k=0;
    //     for(int i=0;i<n;i++){
    //         if(arr[i]>0){
    //             temp[j] = arr[i];
    //             j++;
    //         }
    //         else{
    //             temp1[k] = arr[i];
    //             k++;
    //         }
    //     }
        
    //     int ans[] = new int[count+count1];
    //     int u=0;
    //     int m=0;
    //     int s=0;
    //     for(int i=0;i<n;i++){
    //         if(i%2 != 0){
    //             ans[u] = temp1[m];
    //             u++;
    //             m++;
    //         }
    //         else{
    //             ans[u] = temp[s];
    //             u++;
    //             s++;
    //         }

    //     }
    // return ans;

    // }
    public static void main(String[] args) {
        int arr[] = {3,1,-2,-5,2,-4};
        int ans[] = rearrange(arr);
        for (int i : ans) {
            System.out.print(i+ " ");
            
        }
        // int answer[] = rearrange(arr);
        // for (int i : answer) {
        //     System.out.print(i+ " ");
            
        // }
       
        
    }
    
}
