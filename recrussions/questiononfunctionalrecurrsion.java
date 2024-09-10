package recrussions;

public class questiononfunctionalrecurrsion {


    // reverse a array using recurrsion 

    // here we are using two pointer start and end

    public static void reversearray(int arr[],int start,int end){
        while(start>=end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reversearray(arr, start+1, end-1);
    }



    // reverse an array using recurrsion only using one variable

    public static void reverse(int arr[] , int i ){
        int n = arr.length;
        while(i>=n/2){
            return;
        }
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
            reverse(arr, i+1);
        }
    

        // check if a given string is a palindrome or not using recurssion 

        public static boolean ispalindrome(String s , int start , int end ){
           int n = s.length();
           while(start >= end){
            return true;
           }
           if(s.charAt(start) != s.charAt(end)){
            return false;
           }
           return ispalindrome(s, start+1, end-1);
        }


        // without using two pointer
        // check if the string is plindrome or not

        public static boolean palindrome(String s, int i){
            int n = s.length();
            while(i>=n/2){
                return true;
            }
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
            return palindrome(s, i+1);
        }


        // find factorail 
        public static int findfactorial(int n){
            if(n == 0 || n == 1){
                return n;
            }
            int last = findfactorial(n-1);
            int secondlast = findfactorial(n-2);
            int ans = last + secondlast ;
            return ans;
        }


        // print all the subset using recurssion

        

    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5};
        // int  n = arr.length;
        // reversearray(arr, 0, n-1);
        // reverse(arr, 0);
        // for (int i : arr) {
        //     System.out.print(i + " ");
            
        // }


        // String s = "mam";
        // int n = s.length();
        // System.out.println(ispalindrome(s, 0, n-1));

        // System.out.println(palindrome(s, 0));


        System.out.println(findfactorial(4));
    }
    
}
