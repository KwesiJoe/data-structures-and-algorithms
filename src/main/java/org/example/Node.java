package org.example;

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
     * This method Returns the data of the current node.
     *
     * @return the data stored in the current node
     */
    public T getData() {
        return data;
    }
    /**
     * This is the constructor for the Node class.
     * It takes in a single argument of type T and sets
     * the data of the node to the provided argument.
     * @param data
     * It also sets the next node to null.
     *
     */
    public Node(T data) {
        this.data = data;
    }
    /**
     * This method allows you to set the data of the node
     * to a new value. It takes in a single argument of type T
     * and sets the data of the node to the provided argument.
     * @param data
     */
    public void setData(T data) {
        this.data = data;
    }
    /**
     * This method returns the next node of the current node.
     *
     * @return the next node of the current node, or null if there is no next node
     */
    public Node<T> getNext() {
        return next;
    }
    /**
     *In this method we check if the node argument is not linking to itself.
     * If it is, we throw an IllegalArgumentException
     * with a message indicating that the argument
     * cannot be point to itself, if it is not then we set it as the next.
     */
    public void setNext(Node<T> next) throws IllegalArgumentException{
        if (next == this){
            throw new IllegalArgumentException("Node cannot point to itself");
        }
        else
            this.next = next;
    }
    /**
     * This method returns a boolean indicating if the current
     * node has a next node. It returns true if the next node is not
     * null, and false otherwise.
     * @return true if the current node has a next node, false otherwise
     */
    public boolean hasNext(){
        return this.next != null;

    }
    /**
     * This method returns a string representation of the current node.
     * It returns a string with the format "Node{data}",
     * where "data" is the data of the current node.
     */
    @Override
    public String toString() {
        return "Node{" + this.data + "}";
    }
}
