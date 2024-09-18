package queue;

public class implementQueueUsingArray {

    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        Queue(int n) {       // queue ka ek constructor banaya h or n isme array ka size h
          arr = new int[n];
          size = n;
          rear = -1;
        }   

        //  function to check if the queue is empty or not
        public static boolean isEmpty(){
            return rear == -1;          // if rear == -1 it will return TRUE that means the queue is empty
        }


        // add
        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }
            rear = rear+1;
            arr[rear] = data;
        }
        
        // remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear = rear-1;
            return front;
        }

        // peek

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

        
    }
    
}
