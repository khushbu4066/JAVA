import java.util.LinkedList;

class singlyLL{
    Node head;

    private int size;
    singlyLL(){
        this.size = 0;
    }

    class Node{
        String data;
        singlyLL.Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add first

    public void add(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //Add Last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //Print Ll
    public void printList(){

        if(head == null){
            System.out.print("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    //delete first node
    public void deleteFirst(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last Node
    public void deleteLast(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        size--;

        if(head.next==null){
           head = null;
            return;
        }


        Node secondLast = head;
        Node lastNode  = head.next;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        } 
        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }

    public static void main(String args[]){
        singlyLL list = new singlyLL();
        list.add("a");
        list.add("This");
        // list.printList();

        list.addLast("Linked");
        list.addLast("List");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
    }
}
