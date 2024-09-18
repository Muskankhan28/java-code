package stack;
import java.util.*;

public class reversestringusingstack {

    // reverse a string using stack 

    public static String reverseStringUsingStack(String str){
        Stack<Character>s = new Stack<>();
        int indx = 0;
        int n = str.length();
        while(indx<n){
            s.push(str.charAt(indx));
            indx++;
        }
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
            char top = s.pop();
            sb.append(top);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "helloWorld";
        String ans = reverseStringUsingStack(str);
        System.out.println(ans);
    }
}
