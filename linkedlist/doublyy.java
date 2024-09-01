import java.util.*;

public class doublyy {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data1, Node next1, Node prev1){
            this.data = data1;
            this.next = next1;
            this.prev = prev1;
        }

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
        // convert array to DLL

        public static Node convertorarrtoDLL(int arr[]){
            int n = arr.length;
            Node head = new Node(arr[0]);
            Node prev = head;
            for(int i=1;i<n;i++){
                Node temp = new Node(arr[i] , null ,prev);
                prev.next = temp;
                prev = temp;
            }
            return head;
        }

        // delete head of DLL

        public static Node deletehead(Node head){
            if(head == null || head.next == null){
                return null;
            }
            Node prev = head;
            head = head.next;
            head.prev = null;
            prev.next = null;
            return head;
        }


        // delete tail of DLL

        public static Node deletetail(Node head){
            if(head == null || head.next == null){
                return null;
            }
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            Node prev = temp.prev;
            prev.next = null;
            temp.prev = null;
            return head;
        }


        // delete the kthNode from the DLL

        public static Node deleteKthNode(Node head, int k){
            if(head == null){
                return null;
            }
            int count  = 0;
            Node kthNode = head;
            while(kthNode != null){
                count ++;
                if(count == k){
                    break;
                }
                kthNode = kthNode.next;
            }
            Node previous = kthNode.prev;
            Node NextNode = kthNode.next;


            // edge case
            if(previous == null && NextNode == null){
                return null; 
            }
            // if previous is null that means my kthNode is pointing to the head of the DLL so in that case we have to delete the head
            else if(previous == null){
                return deletehead(head);
            }
            // if nextNode is null that means my kthNode is pointing to the tail of the DLL so in that case we have to delete the tail
            else if(NextNode == null){
                return deletetail(head);
            }
            // establishing the connection here
            // and deleting the KthNode
            previous.next = NextNode;
            NextNode.prev = previous;
            kthNode.next = null;
            kthNode.prev = null;
            return head;
        
        }

        // delete the given Node from the DLL

        public static void DeleteNode(Node head){
            Node temp = head;
            Node previous = temp.prev;
            Node front = temp.next;

            // edge case 
            // when the temp is at the tail the front will be pointing to null

            if(front == null){
                previous.next = null;
                temp.prev = null;
                return;
            }
            previous.next = front;
            front.prev = previous;
            temp.next = null;
            temp.prev = null;

        }

        // print the DLL

        public static void print(Node head){
            if(head == null){
                System.out.println("doubly Linked List is empty");
            }
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+"<->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        // insert before head

        public static Node InsertBeforeHead(Node head , int val){
             Node newheadNode = new Node(val , head , null);
             head.prev = newheadNode;
             return newheadNode;
        }

        // insert before tail

        public static Node InsertBeforeTail(Node head , int val){
            // base case
            // it is the case in which the DLL has only one element 
            // in that case the head and the tail is pointing to the same node so we will simply return the Insertbeforehead
            if(head.next == null){
                return InsertBeforeHead(head,val);
            }
            Node tail = head;
            while(tail.next != null){
                tail = tail.next;
            }
            Node previous = tail.prev;
            Node newNode = new Node(val,tail,previous);
            previous.next = newNode;
            tail.prev = newNode;
            return head;
        }

        


        // insert begfore KthElement

        public static Node insertBeforeKthElement(Node head ,int val, int k){
            // base case
            if(k==1){
                return InsertBeforeHead(head, val);
            }
            Node temp = head;
            int count = 0;
            while(temp.next != null){
                count++;
                if(count == k){
                    break;
                }
                temp = temp.next;
            }
            Node previous = temp.prev;
            Node newNode = new Node(val,temp,previous);
            previous.next = newNode;
            temp.prev = newNode;
            return head;
        }


        // insert before the given Node

        public static void insertbeforenode(Node node, int val){
            Node previous = node.prev;
            Node newNode = new Node(val,node,previous);
            previous.next = newNode;
            node.prev = newNode;
        }


        // reverse a DLL 
        // brute approach

        public static Node reverseDLL(Node head){
            Stack<Integer>st = new Stack<>();
            Node temp = head;
            while(temp != null){
                st.push(temp.data);
                temp = temp.next;
            }
            temp = head;
            while(temp != null){
                temp.data = st.pop();
                temp = temp.next;
            }
            return head;
        }

    
    public static void main(String[] args) {
        int arr[]  = {12,5,8,7};
        Node head = convertorarrtoDLL(arr);
        // print(head);


        // head = deletehead(head);
        // print(head);

        // head = deletetail(head);
        // print(head);

        // head = deleteKthNode(head, 4);
        // print(head);

        // DeleteNode(head.next.next.next);
        // print(head);

        // head = InsertBeforeHead(head, 10);
        // print(head);

        // head = InsertBeforeTail(head, 100);
        // print(head);
        
        // head = insertBeforeKthElement(head, 10, 3);
        // print(head);

        // insertbeforenode(head.next.next, 30);
        // print(head);

        head = reverseDLL(head);
        print(head);
     
    }

    
}
