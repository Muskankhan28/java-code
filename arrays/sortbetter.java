package arrays;

public class sortbetter {
    public static int[] sort(int arr[]){
        int n=arr.length;
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                count0++;
            }
            else if(arr[i] == 1){
                count1++;
            }
            else{
                count2++;
            }
        }
        int temp[] = new int[count0+count1+count2];
        int j=0;
        for(int i=0;i<count0;i++){
            temp[j] = 0;
            j++;
        }
        for(int i=count0;i<n-count2;i++){
            temp[j] = 1;
            j++;
        }
        for(int i=count0+count1;i<n;i++){
            temp[j] = 2;
            j++;
        }
        return temp;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,1,0,1,2,1,2,0,0,0};
        int ans[] = sort(arr);
        for (int i : ans) {
            System.out.print(i+ " ");
            
        }
    }
}
