import java.util.*;

public class quesonsinglylinkedlist {
    public static class Node{
        int data;
        Node next;

        public Node(int data1 , Node next1){
            this.data = data1;
            this.next = next1;
        }

        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    // convert the arr to LL
    public static Node arraytoLL(int arr[]){
        int n = arr.length;
        Node head = new Node(arr[0]);
        Node previous = head;
        for(int i=1;i<n;i++){
            Node temp = new Node(arr[i]);
            previous.next = temp;
            previous = temp;
        }
        return head;
    }
    //print
    public static void printLL(Node head){
        if(head == null){
            System.out.println("LL is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
     //  reverse a singlyLL
    public static Node reverseLL(Node head){
        Node previous = null;
        Node curr = head;
        Node Next;
        while(curr != null){
            Next = curr.next;
            curr.next = previous;
            previous = curr;
            curr = Next;
        }
        return previous;
    }

    public static Node add1toLL(Node head){
        head = reverseLL(head);
        Node temp = head;
        int carry = 1;
        while(temp != null){
            temp.data = temp.data+carry;
            if(temp.data<10){
                carry = 0;
                break;
            }
            else{
                temp.data = 0;
                carry = 1;
            }
            temp = temp.next;
        }
        if(carry == 1){
            Node newNode = new Node(1);
            head = reverseLL(head);
            newNode.next = head;
            return newNode;
        }
        head = reverseLL(head);
        return head;

    }

    public static Node deleteMiddle(Node head){
        // brute approach
        // edge case
        if(head == null || head.next == null){
            return  null;
        }
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int result = count/2;
        temp = head;
        while(temp != null){
            result --;
            if(result == 0){
                Node middle = temp.next;
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    // optimized approach
    public static Node deletetheMiddle(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node slow = head;
        Node fast = head;
        fast = fast.next.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;

    }

    // starting node in the loop of the LL

    // brute approach

    public static Node detectstartNodeofLL(Node head){
        Node temp = head;
        HashMap<Node,Integer>Nodemap = new HashMap<>();
        while(temp != null){
            if(Nodemap.containsKey(temp)){
                return temp;
            }
            else{
                Nodemap.put(temp, 1);
            }
            temp = temp.next;
        }
        
        return null;

    }

    // optimized approach 
    // detect the starting node in the loop of the linkeclist

    public static Node detectTheStartpointofcycleintheLL(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }



    public static void main(String[] args) {
        // int arr[] = {1};
        // Node head = arraytoLL(arr);
        // printLL(head);

        // head = reverseLL(head);
        // printLL(head);

        // head = add1toLL(head);
        // printLL(head);

        // head = deleteMiddle(head);
        // printLL(head);

        // head = deletetheMiddle(head);
        // printLL(head);


        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.next = node2;
        Node node3 = new Node(3);
        node2.next = node3;
        Node node4 = new Node(4);
        node3.next = node4;
        Node node5 = new Node(5);
        node4.next = node5;

        node5.next = node2; 
        Node head = node1;

        Node loopstart = detectstartNodeofLL(head);
        System.out.println(loopstart.data);

         


        
    }
    
}
