package bitmanipualation;

public class minimumsum {
    public static int mountainsum(int arr[]){
        int n = arr.length;
        int minsum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int currentsum = 0;
                for(int k=j+1;k<n;k++){
                    currentsum = arr[i] + arr[j] + arr[k];
                    minsum = Math.max(minsum, currentsum);
                }
             
            } 
            return minsum;
            
        }
        return -1;
      

    }
    public static void main(String[] args) {
        int arr[] = {5,4,8,7,10,2};
        System.out.println(mountainsum(arr));
       
    
        
    }
    
}
                                                                                                 