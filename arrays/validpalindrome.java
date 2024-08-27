package arrays;

public class validpalindrome {
    public static boolean isvalidpalindrome(String s){
        s = s.toLowerCase();
        String p = s.replaceAll("[^a-zA-Z0-9]","");
        int i=0;
        int j=p.length()-1;
        while(i<j){
            if(p.charAt(i) != p.charAt(j)){
                return false;

            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s ="race a car";
        System.out.println(isvalidpalindrome(s));
    }
    
}
