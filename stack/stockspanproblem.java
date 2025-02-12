package stack;
import java.util.*;

public class stockspanproblem {
    // stock span problem 
    public static void stockSpan(int stocks[] , int span[]){
        Stack<Integer>s = new Stack<>();
        span[0] = 1;   // sspan of first day is always going to be 1
        s.push(0);
        for(int i=1;i<stocks.length;i++){
            int currentprice = stocks[i];
            while(!s.isEmpty() && currentprice >= stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }
            else{
                int previoushighIndex = s.peek();
                span[i] = i-previoushighIndex;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int stocks[] = {100,80,60,70,60,85,100};
        int span[] = new int[stocks.length];
        stockSpan(stocks , span);
        for(int i=0;i<span.length;i++){
            System.out.print(span[i] + " ");
        }
    }
}
