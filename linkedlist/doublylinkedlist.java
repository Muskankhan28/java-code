public class doublylinkedlist {

    // node class
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;

        // addfirst

        public void addfirst(int data){
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        //add last

        public void addlast(int data){
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode; 
        }


        // remove first 

        public int removefirst(){
            // base case
            if(head == null){
                System.out.print("Doubly LinkedList is empty");
                return Integer.MIN_VALUE;
            }
            else if(size == 1){
                int val = head.data;
                head = tail = null;
                size--;
                return val;
            }

            int val = head.data;
            head = head.next;
            head.prev = null;
            size--;
            return val;
        }

        // remove last

        public int removelast(){
            if(head == null){
                System.out.print("Doubly Linkedlist is empty");
            }
            else if(size == 1){
                int val = head.data;
                head = tail = null;
                size--;
                return val;
            }
            int val = tail.data;
            Node previousNode = tail.prev;
            previousNode.next = null;
            tail.prev = null;
            size--;
            return val;

        }

        //print
        public void printDoublyLL(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + "<->");
                temp=temp.next;
            }
            System.out.println("null");
        }


        // reverse a doubly linkedlist  

        public void reverse(){
            Node curr = head;
            Node prev = null;
            Node next;
            while(curr != null){
                next = curr.next;
                curr.next = prev;
                curr.prev = next;
                prev = curr;
                curr = next;
            }
            head = prev;
        }

      

    public static void main(String[] args) {
        doublylinkedlist dll = new doublylinkedlist();
        // dll.addfirst(5);
        // dll.addfirst(4);
        // dll.addfirst(3);
        // dll.addfirst(2);
        // dll.addfirst(1);

        dll.addlast(1);
        dll.addlast(2);
        dll.addlast(3);
        dll.addlast(4);
        dll.addlast(5); 
        dll.printDoublyLL();
        // dll.removefirst();
        // dll.removelast();
        dll.reverse();
        dll.printDoublyLL();
        // System.out.println(dll.size);

    }
    
}
