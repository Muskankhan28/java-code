package greedy;
public class breakAPalindrome {
    public static String breakPalnidrome(String palindrome){
        int n = palindrome.length();
        if(n==1){
            return "";
        }
        for(int i=0;i<n/2;i++){
            if(palindrome.charAt(i) != 'a'){
                return palindrome.substring(0, i)+"a"+palindrome.substring(i+1);
            }
        }
        return palindrome.substring(0, n-1)+"b";
    }
    public static void main(String[] args) {
        String palindrome = "abccba";
        String ans = breakPalnidrome(palindrome);
        for(int i=0;i<ans.length();i++){
            System.out.print(ans.charAt(i));
        }
    }
}
