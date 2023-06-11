package main;


//Declaration of LinkedList public class
public class LinkedList {
    private Node head; // declare two private Node namely head & tail
    private Node tail;

    //Constructor for LinkedList
    public LinkedList(){
        this.head = null; // initialization of head to null
        this.tail = null;// initialization of tail to null
    }

    //Getter for head node
    public Node getHead() {
        return this.head;
    }

    //Getter for tail node
    public Node getTail() {
        return this.tail;
    }

    //Add a node to the head of the LinkedList
    public void addToHead(Node node) {
        if (this.head != null){ //if condition to check if head is not empty
            Node currentHead = this.head; //if not empty we store current head node
            node.setNext(currentHead); //Set the next reference of the current head to the new node
            this.head = node;
        }else{          // If the LinkedList is empty, set the head and tail to the new node
            this.head = node;
            this.tail = this.head;
        }
    }

    //Method to Add a node to the tail of the LinkedList with NullPointerException
    public void addToTail(Node node) throws NullPointerException{
        if (this.tail == null){ //check if the tail is nulll
            throw new NullPointerException("empty list cannot have a node!");//print an error message empty list cannot have a node
        }
        this.tail.setNext(node);//Set the next reference of the current tail to the new node
        this.tail = node; // Update the tail node to be the new node
    }

    public void add(Node node) {
        if (this.head == null){
            addToHead(node);
        } else {
            addToTail(node);
        }
    }

    public String print() {
        String output = "<head> ";
        for (Node i = this.head; i != null; i = i.getNext()) {
            output += i.getData() + " ";
        }
        output += "<tail>";
        return output;
    }

    private void removeHead(){
        Node currentHead = this.head;
        if (currentHead.hasNext())
            this.head = currentHead.getNext();
        else {
            this.head = null;
            this.tail = null;
        }
    }


    public void remove(int i) {
        if (i == 0)
            removeHead();
        else {
            Node preNodeToRemove = this.head;
            for (int j = 0; j < i - 1; j++) {
                preNodeToRemove = preNodeToRemove.getNext();
            }
            Node nodeToRemove = preNodeToRemove.getNext();
            /*check if the node to remove is the tail*/
            if (nodeToRemove.getNext() == null){
                preNodeToRemove.setNext(null);
                this.tail = preNodeToRemove;
            }
            else {
                preNodeToRemove.setNext(nodeToRemove.getNext());
            }
        }
    }

    public void reverse() {
        Node start = this.head.getNext();
        this.head.setNext(null);
        Node currentTail = this.tail;
        for (Node i = start; i != currentTail ; ) {
            Node next = i.getNext();
            this.addToHead(i);
            i = next;
        }
        this.addToHead(currentTail);
    }
}
