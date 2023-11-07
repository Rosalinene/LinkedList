/**
 * @author Huong Pham
 * Course: CSC 112-301 Fund of computing II
 * Assignment: LinkedList
 * Description: For this assignment finish implementing the few methods left in the linked list that we did not complete that are already in the interface.

Be sure to test that all methods in the interface work correctly.

Complete

Insert(Object obj, int index) // inserts at the index

RemoveAt(int index) // remove object at the index

RemoveAll(Object obj) // removes all instances of obj
 */
package linkedlist;

public class Node <T>
{
    private Node<T> next;
    private Node<T> previous;
    private T value;

    public Node() 
    {
        next = null;
        previous = null;
        value = null;
    }//End constructor

    public Node(Node<T> next, Node<T> previous, T value) 
    {
        this.next = next;
        this.previous = previous;
        this.value = value;
    }//End Node

    public Node<T> getNext() 
    {
        return next;
    }//End getNext()

    public void setNext(Node<T> next) 
    {
        this.next = next;
    }//End setNext()

    public Node<T> getPrevious() 
    {
        return previous;
    }//End getPrevious()

    public void setPrevious(Node<T> previous) 
    {
        this.previous = previous;
    }//End setPrevious

    public T getValue() 
    {
        return value;
    }//End getValue()

    public void setValue(T value) 
    {
        this.value = value;
    }//End setValue       
}//End Node <T>

