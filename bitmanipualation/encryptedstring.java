package bitmanipualation;

public class encryptedstring {

    public static void reverse(String s){
        char arr[] = s.toCharArray();
        int n = arr.length;
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static String getencryptedstring(String s , int k){
       
    }

    public static void main(String[] args) {
        String s = "dart";
        int k = 3;
      

    }
    
}
