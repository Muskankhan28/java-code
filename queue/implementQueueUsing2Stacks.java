package queue;
import java.util.*;

import arrays.largest;
public class implementQueueUsing2Stacks {
    static class Queue{
        static Stack<Integer>s1 = new Stack<>();
        static Stack<Integer>s2 = new Stack<>();

        // isEmpty()
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        //add()    o(n)
        public static void add(int data){
            //step 1 

            // jbhtk stack 1 khali nhi ho jata tbh tk stack 1 ke andr ke saare elements tum stack 2 ek andr daalte jao

            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            // step 2

            // jbh stack s1 khalli ho jae usme data ko add karvao

            s1.push(data);

            // step 3 

            // jbh tk stack s2 na kahli ho jae tbh tk stack s2 ke elements saare stack s1 mai daal do

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        //remove()    o(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue empty");
                return -1;
            }
            return s1.pop();
        }
        // peek()   o(1)
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();

        }
        
    }
    
}
