package arrays;

public class rearrangeoptimized {
    public static int [] rearrangearray(int arr[]){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            count++;
        }
        int temp[] = new int[count];
        int pos = 0;
        int neg = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > 0){
                temp[pos] = arr[i];
                pos = neg+1;
            }
            else{
                temp[neg] = arr[i];
                neg = pos+1;
            }
        }
        return temp;

    }
    
    public static void main(String[] args) {
        int arr[] = { 3,-2,1,-5,2,-4};
        int ans[] = rearrangearray(arr);
        for (int i : ans) {
            System.out.print(i+ " ");
            
        }
    }
    
}
