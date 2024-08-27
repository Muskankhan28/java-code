
public class linkeddlist {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        //base case
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        // base case
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printLinkedList(){
        // base case
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addMiddle(int indx , int data){
        if(indx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        // size++ helps us to calculate the size of a linkedlist
        size++;
        Node temp = head;
        int i=0;
        while(i<indx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next; 
        temp.next = newNode;
    }

    public int removefirst(){
        if(size == 0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
      
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int removelast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        Node previousnode = head;
        int val = previousnode.next.data;   // tail data
        for(int i=0;i<size-2;i++){
            previousnode = previousnode.next;
        }
        previousnode.next = null;
        tail = previousnode;
        size--;
        return val;
    }


    // question 

    public int search(int key){
        Node temp = head;
        int indx = 0;
        while(temp != null){
            if(temp.data ==  key){
                return indx;
            }
            temp=temp.next;
            indx++;
        }
        return -1;
    }


    // reverse a linkedlist 

    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void delnthfromend(int n){
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp=temp.next;
            size++;
        }
        if(n==size){
            head = head.next;
            return;
        }
        int i=1;
        int indxtofind = size-n;
        Node prev = head;
        while(i<indxtofind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    

    // slow fast pointer 
    // we can find the middle of a linkedlist using slow fast pointer
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public  boolean checkispalinrome(){
        // base case
        if(head == null  && head.next == null){
            return true;
        }
        // 1st step -> find mid
        
        Node midNode = findMid(head);

        // 2nd step -> reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head is prev 
        Node left = head;
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }


    public boolean iscycleexist(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public void removecycle(){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;

    }


    // merge sort on a linkedlist

    private  Node FindMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1 , Node head2){
        Node mergedLL = new Node(-1); //  created a new linkedlist which is intalized by a dummy value -1
        Node temp = mergedLL;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next; 
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;

    }

    public Node mergesort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        // find mid
        Node mid = FindMid(head);

        // left and right mergesort

        Node righthead = mid.next;
        mid.next = null;

        Node newleft = mergesort(head);
        Node newright = mergesort(righthead);
        return merge(newleft , newright);
        
    }

    public void zigzagmerge(){
        // find mid of the linkedlist
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // reverse 2nd half of a linkedlist
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node lefthead = head;
        Node righthead = prev;
        Node leftnext;
        Node rightnext;
        while(lefthead != null && righthead != null){

            // zig zag converstion
            leftnext = lefthead.next;
            lefthead.next = righthead;
            rightnext = righthead.next;
            righthead.next = leftnext;

            // update
            righthead = rightnext;
            lefthead = leftnext;

        }
    
    }


    public static void main(String[] args) {
        linkeddlist ll = new linkeddlist();
        // ll.printLinkedList();
        // ll.addFirst(2);
        // ll.printLinkedList();
        // ll.addFirst(1);
        // ll.printLinkedList();
        // ll.addLast(4);
        // ll.printLinkedList();
        // ll.addLast(5);
        // ll.addMiddle(2, 3);
        // ll.printLinkedList();
        // ll.removefirst();
        // ll.printLinkedList();
        // ll.removelast();
        // ll.printLinkedList();
    
        // System.out.println(ll.size);

        // System.out.println(ll.search(3));
        // System.out.println(ll.search(7));

        // ll.reverse();
        // ll.printLinkedList();

        // ll.delnthfromend(3);
        // ll.printLinkedList();

        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // // ll.addLast(1);
        // ll.printLinkedList();
        // System.out.println(ll.checkispalinrome());




        // cyclic linkedlist

        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next=temp;
        // // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // System.out.println(ll.iscycleexist());
        // ll.removecycle();
        // System.out.println(ll.iscycleexist());



        // merge sort

        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(4);
        // ll.addFirst(5);
        // ll.printLinkedList();
        // ll.head = ll.mergesort(ll.head);
        // ll.printLinkedList();

        //zig zag conversion

        ll.addLast(1);
        ll.addLast(1);
        ll.addLast(2);
       
        ll.printLinkedList();
        // ll.zigzagmerge();
        // ll.printLinkedList();
       

    }
    
}
