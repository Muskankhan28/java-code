package arrays.string;

public class palinrome {
    public static boolean ispalindrome(String s){
        char arr[] = s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i] != arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "civic";
        System.out.println(ispalindrome(s));
    }
    
}
