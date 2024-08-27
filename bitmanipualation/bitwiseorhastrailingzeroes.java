package bitmanipualation;

public class bitwiseorhastrailingzeroes {
    public static boolean hastrailingzeroes(int arr[]){
        int n =arr.length;
        int xor = 0;
        for(int i=0;i<n;i++){
            if(arr[i] % 2 == 0){
                xor = xor ^ arr[i];
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
    }
    
}
