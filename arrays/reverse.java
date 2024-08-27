package arrays;

public class reverse {


    public static void reverseee(char arr[] , int i ,  int j){
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static String reverse(String s){
        char arr[] = s.toCharArray();
        int n = arr.length;
        int i=0;
        for(int j=0;j<=n;j++){
            if(j==n || arr[j] == ' '){
                reverseee(arr, i, j-1p);
                i=j+1;
            }
        } 
        return new String(arr);
    }
    
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.print(reverse(s));
    
    }
}

