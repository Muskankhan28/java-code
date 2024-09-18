package stack;
import java.util.*;

public class duplicateparanthesis {
    public static boolean iscontainsduplicateparanthesis(String s1){
        Stack<Character>s = new Stack<>();
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            // closing
            if(ch ==')'){
                int count = 0;
                while(s.peek() !='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;     // duplicate exist
                }
                else{
                    s.pop();        //  pop kradiya opening pair ko stack se
                }
            }
            // opening conditon
            else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // String s1 = "((a+b))"; // true it means it contains duplicate
        String s2 = "(a-b)";   // false it means it doesnot contain duplicate

        System.out.println(iscontainsduplicateparanthesis(s2));
    }
}
