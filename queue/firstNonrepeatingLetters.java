package queue;
import java.util.*;

public class firstNonrepeatingLetters {

    public static void printFirstNonRepeatingCharacter(String s){
        Queue<Character>q = new LinkedList<>();
        char frequency[] = new char[26]; // 'a'-'z'
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch  = s.charAt(i);
            q.add(ch);
            frequency[ch-'a']++;
            while(!q.isEmpty() && frequency[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1 + " ");
            }
            else{
                System.out.print(q.peek() + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String s = "aabccxb";
        printFirstNonRepeatingCharacter(s);
    }
    
}
