package recrussions;

public class dice {
    public static int count(int n){
        int currsum = n;
        if(currsum == 0){
            return 1;
        }
        int ans = 0;
        for(int i=1;i<=6;i++){
            if(i>currsum){
                break;
            }
            ans += count(n-i);
        }
        return ans;
    }


    public static int counttt(int currentsum ,int arr[] , int n){
        int m = arr.length;
      
        if(currentsum == 0){
            return 1;
        }
        if(currentsum < 0){
            return 0;
        }
        int ans = 0;
        for(int i=0;i<m;i++){
            ans += counttt(currentsum-arr[i], arr, n);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5};
        int n = 3;

        int sum = 9;
        // System.out.println(count(n));
        int currentsum = n;
        System.out.println(counttt(currentsum, arr, currentsum));


        
    }
    
}
