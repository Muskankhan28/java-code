package bitmanipualation;

public class countthesetbitbrute {

    public static String reverse(String result){
        String ans = " ";
        for(int i=result.length()-1;i>=0;i--){
            ans += result.charAt(i);
        }
        return ans;
    }

    public static String convertnotobinary(int n){
        String result = " ";
        while(n!=1){
            if(n%2 == 1){
                result += "1";
            }
            else{
                result += "0";
            }
            n = n/2;
            if(n==1){
                result += "1";
            }
        }
        return reverse(result);
    }
   
    public static void main(String[] args) {
        int n = 5;
        System.out.println(convertnotobinary(n));
  
    }
    
}
