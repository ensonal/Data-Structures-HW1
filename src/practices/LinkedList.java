package practices;

class Main{
    public static void main(String[] args){
       

        LinkedList<Integer> l1 = new LinkedList(); // Eğer linkedlist ıntegersa Node da integer gelmek zorunda
        System.out.println(l1.isEmpty());

        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);
        l1.addLast(6);
        System.out.println(l1.isEmpty());

        l1.print();
        
    }
}

class Node<E>{
    private E value;
    private Node<E> next;


    public Node() {
    }

    public Node(E value) {
        this.value = value; 
    }
    

    public E getValue() {
        return this.value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node<E> getNext() {
        return this.next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

}

class LinkedList<E>{
    Node<E> head;
    Node<E> tail;




    public boolean isEmpty(){
        if(head == null){
            return true;
        }else{
            return false;
        }

    }

    public void addLast(E value){
        Node<E> newNode = new Node(value);
            if(head == null){
                head = newNode;
            }else{
                tail.setNext(newNode);
            }
            tail = newNode;
    }
    
    
    public void print(){
        this.print(head);
 
    }
        
    

    private void print(Node<E> node){
        if(node == null){
            return;
        }

        System.out.println(node.getValue());
        print(node.getNext());
    }


}
