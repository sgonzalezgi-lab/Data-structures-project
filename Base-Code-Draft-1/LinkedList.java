public class LinkedList<T>{
    class Node<T>{
        T value;
        Node next;
        
        Node(T item){
            value=item;
            next=null;
        }
    }
    
    Node head;
    
    LinkedList(){
        head=null;
    }
    
    public void pushBack(T item){
        Node newNode = new Node(item);
        newNode.next=head;
        head=newNode;
    }
    
    
    
}