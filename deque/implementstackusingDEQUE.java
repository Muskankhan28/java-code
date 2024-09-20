package deque;
import java.util.*;

public class implementstackusingDEQUE {
    static class Stack{
        static Deque<Integer>dq = new LinkedList<>();

        // push()
        public static void push(int data){
            dq.addLast(data);
            
        }
        // pop()
        public static int pop(){
           return dq.removeLast();
        }
        // peek()
        public static int peek(){
            return dq.getLast();
        }

    }


    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

      System.out.println(s.pop());
      System.out.println(s.pop());
      System.out.println(s.pop());

    }
    
}
