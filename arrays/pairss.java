package arrays;

public class pairss {
    public static void pairs(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    System.out.print(arr[i] + " ," + arr[j]);
                    System.out.println();

                }
              
            }
        
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        pairs(arr);

        
    }
    
}
