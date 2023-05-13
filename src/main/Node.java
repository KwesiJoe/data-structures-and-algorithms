package main;

/**
 * Node Class Documentation
 * 
 * Introduction
 * 
 * This is a Java class that defines a linked list node. 
 * It has a generic type T, which allows the node to hold any type of data. 
 * This class defines the basic operations that can be performed on a node 
 * in a linked list, such as setting and getting data and linking to another node.
 * 
 */
public class Node<T> {
    private T data;
    private Node<T> next;

    /**
     * This is the constructor for the Node class. 
     * It takes in a single argument of type T and sets 
     * the data of the node to the provided argument. 
     * @param data
     * It also sets the next node to null.
     * 
     */
    public Node(T data){
        this.data = data;
        this.next = null;
    }

    /**
     * This method allows you to set the data of the node 
     * to a new value. It takes in a single argument of type T 
     * and sets the data of the node to the provided argument.
     * @param data
     */
    public void setData(T data){
        this.data = data;
    }

    /**
     *In this method we first check if the node argument is null. 
     * If it is, we throw an IllegalArgumentException 
     * with a message indicating that the argument 
     * cannot be null. If the node argument is not null, 
     * we proceed with the another check to ensure that 
     * the node is not linked to itself before setting it as the next node.
     */
    public void setNext(Node<T> node) throws IllegalArgumentException{
        if (node == null) {
            throw new IllegalArgumentException("node argument cannot be null");
        }
        else if (!this.equals(node)) {
            this.next = node;
        }
        else {
            throw new IllegalArgumentException("node cannot be linked to itself");
        }
    }


    /**
     * This method returns a boolean indicating if the current 
     * node has a next node. It returns true if the next node is not 
     * null, and false otherwise.
     * @return
     */
    public boolean hasNext(){
        return !(this.getNext() == null);
    }


    /**
     * This method returns the data of the current node.
     * @return
     */
    public T getData(){
        return this.data;
    }

    /**
     * This method returns the next node of the current node.
     * @return
     */
    public Node<T> getNext() {
        return this.next;
    }

    /**
     * This method returns a string representation of the current node. 
     * It returns a string with the format "Node{data=data}", 
     * where "data" is the data of the current node.
     */
    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}

