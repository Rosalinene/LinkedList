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

public interface LinkedListInterface <T>
{
    public boolean IsEmpty();
    public int Size();
    public void Append(T obj);
    public void AddFront(T obj);
    public void Insert(T obj, int position);
    public void Insert(T obj);
    public boolean RemoveEnd();
    public boolean RemoveFront();
    public boolean RemoveAt(int position);
    public boolean Remove(T obj);
    public boolean RemoveAll(T obj);
    
    public T GetValue(int position);
    public T GetValueEnd();
    public T GetValueFront();
            
}
