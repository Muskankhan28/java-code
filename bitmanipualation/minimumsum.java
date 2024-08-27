package bitmanipualation;

public class minimumsum {
    public static int mountainsum(int arr[]){
        int n = arr.length;
        int minsum = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int currentsum = 0;
                for(int k=j+1;k<n;k++){
                    if(arr[i]<arr[j] && arr[k]<arr[j]){
                        currentsum = arr[i] + arr[j] + arr[k];
                        minsum = Math.min(minsum, currentsum);
                    }
                }
                
            } 
        }
        return minsum;
    }
    public static void main(String[] args) {
        int arr[] = {6,5,4,3,4,5};
        System.out.println(mountainsum(arr));
    }
    
}
