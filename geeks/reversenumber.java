package geeks;

public class reversenumber {
    public static boolean ispalindrome(int n){
        int reverse = 0;
        int temp = n;
        while(temp!=0){
            int lastdigit = temp%10;
            reverse = reverse*10+lastdigit;
            temp=temp/10;
        }
        if(reverse == n){
            return true;
        }
        return false;
    
    }
    public static void main(String[] args) {
        int n = 121;
        System.out.println(ispalindrome(n));
        
    }
    
}
