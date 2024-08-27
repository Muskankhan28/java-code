package arrays;

public class longestconsecutivesequence {
    //  brute approach
    public static boolean linearsearch(int arr[] , int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == k){
                return true;
            }
        }
        return false;

    }
    public static int longestsequence(int arr[]){
        int longest = 1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int x = arr[i];
            int count = 1;
            while(linearsearch(arr, x+1)==true){
                x = x+1;
                count = count+1;
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }
    public static void main(String[] args) {
        int arr[] = {102,4,100,1,101,3,2,1,1};
        System.out.println(longestsequence(arr));

    }
}
