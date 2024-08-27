package arrays;

public class largest {
    public static int largestelement(int arr[]){
        int i=0;
        int largeelement = 0;
        while (i<arr.length) {
            if(arr[i]>largeelement){
                largeelement=arr[i];
            }
            i++;
            
        }
        return largeelement;
    }
    public static void main(String[] args) {
        int arr[] = {7,9,23,5,6,20};
        System.out.println(largestelement(arr));
    }
    
}
