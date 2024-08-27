package arrays;

import java.util.*;

public class quesgeek {
    public static int calculatepower(int x, int n){
        int power = 1;
        for(int i=1;i<=n;i++){
            power = power * x;
        }
        return power;
      
        }
    

    public static void main(String[] args) {
        int x=3;
        int n=4;
        System.out.println(calculatepower(x, n));
    }

    // SIEVE ERATOSTHENCES ALGORITHM
    // public static void printprimeusingsievealgo(int n){
    //     if(n<=1){
    //         return ;
    //     }
    //     boolean temp[] = new boolean[n+1];
    //     Arrays.fill(temp,true);
    //     for(int i=2;i*i<n;i++){
    //         if(temp[i]){
    //             for(int j=i*2;j<=n;j=j+i){
    //                 temp[j] = false;
    //             }
    //         }
    //     }
    //     for(int i=2;i<n;i++){
    //         if(temp[i]){
    //             System.out.println(i);
    //         }
    //     }

    // }




    // public static boolean isprime(int n){
    //     if(n==1){
    //         return false;
    //     }
    //     if(n==2 || n==3){
    //         return true;
    //     }
    //     if(n%2 == 0 || n%3 == 0){
    //         return false;
    //     }
    //     for(int i=5;i*i<=n;i=i+6){
    //         if(n%i == 0 || n%i+2 == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void printprime(int n){
    //     for(int i=2;i<n;i++){
    //         if(isprime(i)){
    //             System.out.println(i);
    //         }
          
    //     }
    // }



    // public static void main(String[] args) {
    //     int n =23;
    //     printprimeusingsievealgo(n);
       
        // printprime(n);

    }
    // public static void alldivisor(int n){
    //     for(int i=1;i<=n;i++){
    //         if(n%i == 0){
    //             System.out.println(i);
    //         }
    //     }
    // }

    // public static void main(String[] args) {
    //     int n =25;
    //     alldivisor(n);
     
       
    // }
 






    // public static void primefactor(int n){
    //     if(n<=1){
    //         return ;
    //     }
    //     while(n%2 == 0){
    //         System.out.println(2);
    //         n = n/2;
    //     }
    //     while(n%3 == 0){
    //         System.out.println(3);
    //         n = n/3;
    //     }
    //     for(int i=5;i*i<=n;i=i+6){
    //         while(n%i == 0){
    //             System.out.println(i);
    //             n = n/i;
    //         }
    //         while(n%i+2 == 0){
    //             System.out.println(i);
    //             n = n/i+2;
    //         }
    //     }
    // }

   


    // public static void primefactor(int n){
    //     if(n<=1){
    //         return;
    //     }
    //     for(int i=2;i*i<n;i++){
    //         while(n%i == 0){
    //             System.out.println(i);
    //             n=n/i;
    //         }
    //     }
    //     if(n>1){
    //         System.out.println(n);
    //     }
    // }


    // brute approach


    // public static boolean isprime(int n){
    //     if(n==1){
    //         return false;
    //     }
    //     if(n==2 || n==3){
    //         return true;
    //     }
    //     if(n%2 == 0 || n%3 == 0){
    //         return false;
    //     }
    //     for(int i=5;i*i<=n;i=i+6){
    //         if(n%i == 0 || n%i+2 == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void primefactor(int n){
    //     for(int i=2;i<n;i++){
    //         if(isprime(i)){
    //             int x = i;
    //             while(n%x == 0){
    //                 System.out.println(i);
    //                 x=x*i;
    //             }
    //         }
    //     }


    // }
    // public static void main(String[] args) {
    //     int n = 450;
    //     primefactor(n);
    // }




    // optimized solution
    
    // public static boolean isprime(int n){
    //     if(n==1){
    //         return false;
    //     }
    //     if(n==2 || n==3){
    //         return true;
    //     }
    //     if(n%2 == 0 || n%3 == 0){
    //         return false;
    //     }
    //     for(int i=5;i*i<=n;i=i+6){
    //         if(n%i == 0 || n%(i+2) == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // public static void main(String[] args) {
    //     int n =121;
    //     System.out.println(isprime(n));
    // }








    // better approach

    // public static boolean isprime(int n){
    //     if(n==1){
    //         return false;
    //     }
    //     for(int i=2;i*i<n;i++){
    //         if(n%i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void main(String[] args) {
    //     int a =13;
    //     System.out.println(isprime(a));
    // }

    // brute approach

    // public static boolean isprime(int n){
    //     if(n==1){
    //         return false;
    //     }
    //     for(int i=2;i<n;i++){
    //         if(n%i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void main(String[] args) {
    //     int n = 7;
    //     System.out.println(isprime(n));
    // }

    // optimized solution for finding lcm 

    // public static int findgcd(int a, int b){
    //     while(a>0 && b>0){
    //         if(a>b){
    //             a = a%b;
    //         }
    //         else{
    //             b= b%a;
    //         }
    //         if(a==0){
    //             return b;
    //         }
    //     }
    //     return a;
    // }

    // public static int findlcm(int a , int b){
    //     return a*b/findgcd(a, b);
        
    // }
    // public static void main(String[] args) {
    //     int a=4;
    //     int b=6;
    //     System.out.println(findlcm(a, b));
    // }





    // brute solution

    // public static int findlcm(int a, int b){
    //     int result = Math.max(a,b);
    //     while(true){
    //         if(result%a==0 && result%b==0){
    //             break;
    //         }
    //         result++;
    //     }
    //     return result;
    // }
    // public static void main(String[] args) {
    //     int a=4;
    //     int b=6;
    //     System.out.println(findlcm(a, b));
    // }


    // euclidean algorithm


    // public static int findgcd(int a, int b){
    //     while(a>0 && b>0){
    //         if(a>b){
    //             a=a%b;
    //         }
    //         else{
    //             b=b%a;
    //         }
    //         if(a==0){
    //             return b;
    //         }
    //     }
    //     return a;
    // }
   

    // public static void main(String[] args) {
    //     int a= 52;
    //     int b =10;
    //     System.out.println(findgcd(a, b));
    // }


    // brute approach


    // public static int findgcd (int a, int b){
    //     int result = Math.min(a, b);
    //     while(result>0){
    //         if(a%result == 0 && b%result == 0){
    //             break;
    //         }
    //         else{
    //             result --;
    //         }
    //     }
    //     return result;
        
    // }
    // public static void main(String[] args) {
    //     int a = 100;
    //     int b = 200;
    //     System.out.println(findgcd(a, b));
    // }










    // public static int findtrailingzeroes(int n){
    //     int count = 0;
    //     for(int i=5;i<=n;i=i*5){
    //         count = count+n/i;
    //     }
    //     return count;
    // }



    // brute solution


    // public static int findtrailingzeroes(int n){
    //     int fact = 1;
    //     for(int i=2;i<=n;i++){
    //         fact=fact*i;
    //     }
    //     int count = 0;
    //     while(fact%10 == 0){
    //         count++;
    //         fact = fact/10;
    //     }
    //     return count;

    // }
     
    
    // public static void main(String[] args) {
    //     int n = 100;
    //     System.out.println(findtrailingzeroes(n));
    //     // System.out.println(findtrailingzeroes(n));
    // }









    // public static int findfactorial(int n){
    //     int fact = 1;
    //     if(n==0 || n==1){
    //         return 1;
    //     }
    //     for(int i=2;i<=n;i++){
    //         fact = fact*i;
    //     }
    //     return fact;
    // }


    // recursive solution

    // public static int findfact(int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     return n*findfact(n-1);
    // }
    // public static void main(String[] args) {
    //     int n=5;
    //     System.out.println(findfact(n));
    //     // System.out.println(findfactorial(n));
    // }



    // public static boolean ispalindrome(int n){
    //     int reversenumber = 0;
    //     int temp = n;
    //     while(temp>0){
    //         int lastdigit = temp%10;
    //         reversenumber = reversenumber*10+lastdigit;
    //         temp = temp/10;

    //     }
    //     if(reversenumber == n){
    //         return true;
    //     }
    //     return false;
    // }


    // public static void main(String[] args) {
    //     int n = 367;
    //     System.out.println(ispalindrome(n));
    // }




    // public static int count(int x){
    //     int countdigits = 0;
    //     while(x>0){
    //         x=x/10;
    //         countdigits++;
    //     };
    //     return countdigits;
    // }
    // public static void main(String[] args) {
    //     int x = 34562;
    //     System.out.println(count(x));

    // }
    
// }
