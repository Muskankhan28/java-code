package stack;
import java.util.*;

public class reversseeStack {
    // function to insert element at the bottom 
    public static void pushAtBottom(Stack<Integer>s , int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    // function to reverse a stack
    public static void reverseStack(Stack<Integer>s){
        if(s.isEmpty()){    //  an empty stack is a reversed stack so in that particular case we will simply just return
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    // function to print a stack
    public static void printStack(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    public static void main(String[] args) {
        Stack<Integer>s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // originall stack will look like 3 2 1
        reverseStack(s);
        // after reverse the stack will look like 1 2 3 
        printStack(s);
        // print function is goin to print the stack in 1 2 3 order
    }
}
