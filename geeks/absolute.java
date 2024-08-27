package geeks;

import java.math.BigInteger;

public class absolute {
    public static double cal(int a, int b, int n){
        double answer =  a*(int)(Math.pow(b, n-1));
        return answer;

    }
    public static void main(String[] args) {
        int a = 84;
        int b = 87;
        int n = 3   ;
        System.out.println(cal(a, b, n));
    }

  











    // public static long factorial(int n){
    //     long fact = 1;
    //     for(int i=1;i<=n;i++){
    //         fact = fact*i;
    //     }
    //     return fact;
    // }


    // public static void main(String[] args) {
    //     int n = 13;
    //     System.out.println(factorial(n));
    // }





    // public static double celciustofarenite(int c){
    //     int fahenheit = (c*9/5)+32;
    //     return fahenheit;
    // }

    // public static void main(String[] args) {
    //     int c = 32;
    //     System.out.println(celciustofarenite(c));
    // }





    // public static int absoulteans(int n){
    //     int ans = Math.abs(n);
    //     return ans;
    // }
    // public static void main(String[] args) {
    //     int i =45;
    //     System.out.println(absoulteans(i));
    // }
    
}
