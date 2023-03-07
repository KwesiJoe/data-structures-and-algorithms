package main;

public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList(){
        this.head = null;
        this.tail = null;
    }

    public Node getHead() {
        return this.head;
    }

    public Node getTail() {
        return this.tail;
    }

    public void addToHead(Node node) {
        if (this.head != null){
            Node currentHead = this.head;
            node.setNext(currentHead);
            this.head = node;
        }else{
            this.head = node;
            this.tail = this.head;
        }
    }

    public void addToTail(Node node) throws NullPointerException{
        if (this.head == null){
            throw new NullPointerException("empty list cannot have a node!");
        }
        if (this.head.equals(this.tail)){
            this.head.setNext(node);
        }else {
            this.tail.setNext(node);
        }
        this.tail = node;

    }

    public void add(Node node) {
        if (this.head == null){
            addToHead(node);
        } else {
            addToTail(node);
            }
        }
}
