package bitmanipualation;

public class decimaltobinary {

   
    public static String reverseString(String result){
        String ans = " ";
        for(int i = result.length()-1;i>=0;i--){
            ans += result.charAt(i);
        }
        return ans;
      
    }
    public static String convert2binary(int n){
        String result = " ";
        while(n!=1){
            if(n%2 == 1){
                result += "1";
            }
            else{
                result += "0";
            }
            n=n/2;
            if(n==1){
                result += "1";
            }
        }
        return reverseString(result);
    }

    public static int countdigit(String anss){
        int count = 0;
        for(int i=0;i<anss.length()-1;i++){
        
            if(anss.charAt(i) == '1'){
                count ++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int n = 13;
        String anss = convert2binary(n);
        System.out.println(anss);
        int counts = countdigit(anss);

        System.out.println(counts);
    }
    
}
