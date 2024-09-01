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
    public static void main(String[] args) {
        int arr[] = {1,5,9};
        Node head = arraytoLL(arr);
        printLL(head);
    }
    
}
