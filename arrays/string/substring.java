package arrays.string;

public class substring {
    // public static String findsubstrings(String s , int si , int ei){
    //     String ans = " ";
    //     char arr[] = s.toCharArray();
    //     for(int i=si;i<ei;i++){
    //         ans+=arr[i];
    //     }
    //     return ans;
    // }
    public static void main(String[] args) {
        String s = "helloWorld";
        int si = 0;
        int ei = 5;

        // s.substring is a build in function in java 
        String ans = s.substring(0, 5);
        System.out.println(ans);
        // System.out.println(findsubstrings(s, si, ei));
    }
    
}
