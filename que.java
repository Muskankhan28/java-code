public class que {
    public static int findGCD(int a ,  int b){
        int result = Math.min(a,b);
        while(result> 0){
            if(a%result == 0 && b%result == 0){
                break;
            }
            else{
                result --;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int a = 100 ;
        int b = 200 ;
        System.out.println(findGCD(a, b));
    }









    // public static int findtrailingzeroes(int n){
    //     int fact = 1;
    //     for(int i=1;i<=n;i++){
    //         fact = fact*i;
    //     }
    //     int x = fact;
    //     int count = 0 ;
    //     while(x%10 == 0){
    //         count ++;
    //         x=x/10;
    //     }
    //     return count;
    // }



    // public static int findtrailingszero(int n){
    //     int count = 0;
    //     for(int i=5;i<=n;i=i*5){
    //         count = n/i+count;
    //     }
    //     return count;
    // }
    // public static void main(String[] args) {
    //     int n = 251;
    //     System.out.println(findtrailingszero(n));
    //     // System.out.println(findtrailingzeroes(n));
    // }



















    // public static int findfact(int n){
    //     int fact = 1;
    //     for(int i=1;i<=n;i++){
    //         fact = fact*i;
    //     }
    //     return fact;
    // }
    // public static void main(String[] args) {
    //     int n = 5;
    //     System.out.println(findfact(n));
    // }























    // public static boolean isplaindrome(int n){
    //     int reverse = 0;
    //     int temp = n;
    //     while(temp != 0){
    //         int lastdigit = temp%10;
    //         reverse = reverse*10+lastdigit;
    //         temp = temp/10;

    //     }
    //     if(reverse == n){
    //         return true;
    //     }
    //     return false;
    // }
    // public static void main(String[] args) {
    //     int n = 123321;
    //     System.out.println(isplaindrome(n));
    // }













    // public static int countdigits(int x){
    //     int count = 0;
    //     while(x>0){
    //         x = x/10;
    //         count++;
    //     }
    //     return count;
    // }
    // public static void main(String[] args) {
    //  int x = 5896312;
    //  System.out.println(countdigits(x));
    // }
    
}
