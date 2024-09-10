package recrussions;

public class countnumberofsubsequences {

    // count the number of subsequences whose sum is equall to target
    
    public static int countsubsequences(int indx ,int arr[] , int sum , int target){
        int n = arr.length;
        if(indx == n){
            if(sum == target){
                return 1;
            }
            else{
                return 0;
            }
        }
        sum = sum+arr[indx];
        int l = countsubsequences(indx+1, arr, sum, target);
        sum = sum-arr[indx];
        int r = countsubsequences(indx+1, arr, sum, target);
        int count = l+r;
        return count;
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        int sum = 0;
        int target = 2;
        System.out.println(countsubsequences(0, arr, 0, 2));
    }
    
}
