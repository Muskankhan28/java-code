public class arraytolinkedlist {
    // create a node class
    public static class Node{
        int data;
        Node next;
        public Node(int data1 , Node next1){
            this.data = data1;
            this.next = next1;

        }

        public Node(int data){
            this.data = data;
            this.next = null;
        }
        public static Node tail;
    }


    // concvert array to a linkledlist
    public static Node arraytolinkedlistconvert(int arr[]){
        int n = arr.length;
      
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1;i<n;i++){
            Node temp = new Node(arr[i]);
            prev.next = temp;
            prev = prev.next;
        }
        return head;
    }

    // calculate the length of a linkedlist
    public static int callengthofLL(Node head){
        int length = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            length++;
        }

        return length;
    }

    // search in a linkedlist

    public static boolean ispresent(Node head, int val){
        Node temp = head;
        while(temp != null){
            if(temp.data == val){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }


    // search in a linkedlist

    public static int calindex(Node head , int val){
        Node temp = head ;
        int i=0;
        while(temp != null){
            if(temp.data == val){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }


    // print the linkedlist

    public static void printll(Node head){
        if(head == null){
            System.out.println("Linkedlist is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    // remove first element of a linkedlist(which is basically the head of a linkedlist)

    public static Node removehead(Node head){
        if(head == null){
            return head;
        }
        head = head.next;
        return head;
    
    }

    // remove last  element of a linkedlist(which is basically a tail of a linkedlist)

    public static Node removetail(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    // remove kth element from a linkedlist

    public static Node removeKthelement(Node head , int k){
        if(head == null){
            return head;
        }
        if(k==1){
            head = head.next;
            return head;
        }
        int count = 0;
        Node temp = head;
        Node prev = null;
        while(temp != null){
            count++;
            if(count == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }


    // remove the given element from the linkedlist

    public static Node removeele(Node head,  int ele){
        if(head == null){
            return head;
        }
        if(head.data == ele){
            Node temp = head;
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while(temp != null){
            if(temp.data == ele){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }


    // add first (Insert the element at first of a linkedlist)

    public static Node addfirst(Node head , int data){
        Node newNode = new Node(data,head);
        return newNode;

    }

    // add last (insert at the end of the linkedlist)


    public static Node addlast(Node head , int data){
        if(head == null){
            return new Node(data);
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(data);
        temp.next = newNode;
        return head;
    }

    public static Node insertposition(Node head, int element ,int k){
        if(head == null){
            if(k==1){
                return new Node(element);
            }
            else{
                return null;
            }
        }
        // insertion at head
        if(k == 1){
            Node newNode = new Node(element , head);
            return newNode;

        }
        int count = 0;
        Node temp = head;
        while(temp != null){
            count ++;
            if(count == (k-1)){
                Node newNode = new Node(element);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;  
    }



    public static Node insertbeforevalue(Node head, int element ,int val){
        if(head == null){
            return null;
        
        }
        
        if(head.data == val){
            Node newNode = new Node(element , head);
            return newNode;

        }

        Node temp = head;
        while(temp.next != null){
            
            if(temp.next.data == val){
                Node newNode = new Node(element);
                newNode.next = temp.next; 
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;  
    }



    public static void main(String[] args) {
        int arr[] = {2,5,6,8,12};
        int val = 8;
        Node head = arraytolinkedlistconvert(arr);
        System.out.println(head.data);


        //  head = removehead(head);
        //  printll(head);

        // head = removetail(head);
        // printll(head);
        

        // head = removeKthelement(head, 6);
        // printll(head);


        // head = removeele(head, 8);
        // printll(head);
       


        // head = addfirst(head, 100);
        // printll(head);

        // head = addlast(head, 100);
        // printll(head);

        // head = insertposition(head,  100, 1);
        // printll(head);

        head = insertbeforevalue(head, 100, 8);
        printll(head);


        // System.out.println(callengthofLL(head));
        // System.out.println(ispresent(head, val));
        // System.out.println(calindex(head, val));


        // traversing on a linkedlist
      
        // Node temp = head;
        // while(temp != null){
        //     System.out.print(temp.data + "->");
        //     temp = temp.next;
        // }
        // System.out.println("null ");
    }
}
