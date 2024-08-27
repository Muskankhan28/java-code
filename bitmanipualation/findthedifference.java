package bitmanipualation;

import java.util.Arrays;

import arrays.sort;

public class findthedifference {


 
    public static char findthediffernece(String s ,  String t){
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        char temp[] = t.toCharArray();
        Arrays.sort(temp);
        int n = arr.length;
        int m = temp.length;
        for(int i=0;i<n;i++){
            if(arr[i] != temp[i]){
                return temp[i];
            }
        }
        return temp[temp.length-1];
    }
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findthediffernece(s, t));
    }
    
}
