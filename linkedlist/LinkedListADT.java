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

public class LinkedListADT  <T extends Comparable> implements LinkedListInterface
{
    protected int size;
    protected Node<T> front;
    protected Node<T> back;
    
    public LinkedListADT()
    {
        front = null;
        back = null;
        size = 0;
    }//End constructor
    
    @Override
    public boolean IsEmpty() 
    {
        boolean result = false;
        
        if(front == null)
            result = true;
        
        return result;
    }//End isEmpty

    @Override
    public int Size() 
    {
        return size;
    }//End Size

    @Override
    public void Append(Object obj) 
    {
        if(back == null)
        {
            AddFront(obj);
        }//End if
        else
        {
            Node<T> temp = new Node(null, back, (T)obj);
            back.setNext(temp);
            back = temp;
            size++;
        }//End else
    }//End Append

    @Override
    public void AddFront(Object obj) 
    {
        if(IsEmpty())
        {
            Node<T> temp = new Node<T>(null, null,(T)obj);
            front = back = temp;
        }//End if
        else
        {
            Node<T> temp = new Node<T>(front, null, (T)obj);
            front.setPrevious(temp);
            front = temp;
        }//End else
        size++;
    }//End AddFront

    @Override
    /*
    THIS IS YOUR HOMEWORK
    */
    public void Insert(Object obj, int position) 
    {
        if (position == 0) {
            AddFront(obj);
        }
        else if (position > this.size) {
            throw new IllegalArgumentException("Position must be less or equal to list size");
        }
        else {
            Node<T> current = front;
            for(int i = 0; i < position-1; i++) {
                current = current.getNext();
            }
            Node<T> next = current.getNext();
            Node<T> temp = new Node<T>(next, current, (T)obj);
            current.setNext(temp);
            if (next != null) {
                next.setPrevious(temp);
            }
            size++;
        }
    }

    @Override
    /*
        
    */
    public void Insert(Object obj)
    {
        int count = 0;
        Node<T> current = front;
        Node<T> previous = current.getPrevious();
        
        Comparable temp = (Comparable)current.getValue();
        
        while(current != null && 
                (temp.compareTo((Comparable)obj)) < 0)
        {
            previous = current;
            current = current.getNext();
            temp = (Comparable)current.getValue();
            count++;
        }
        
        Insert(obj, count);
    }

    @Override
    public boolean RemoveEnd() 
    {
        boolean result = false;
        
        if(!(IsEmpty()))
        {
            if(front == back)
            {
                front = back = null;
            }
            else
            {
                Node<T> temp = back.getPrevious();
                temp.setNext(null);
                back.setPrevious(null);
                back = temp;
            }
            
            size--;
            result = true;
        }
        
        return result;
    }

    @Override
    public boolean RemoveFront() 
    {
        boolean result = false;
        
        if(!(IsEmpty()))
        {
            if(front == back)
            {
                front = back = null;
            }
            else
            {
                Node<T> temp = front.getNext();
                temp.setPrevious(null);
                front.setNext(null);
                front = temp;
            }
            
            size--;
            result = true;
        }
        
        return result;
    }

    /*
    YOUR HOMEWORK
    */
    @Override
    public boolean RemoveAt(int position) 
    {
        boolean result = false;
        if (position == 0) {
            result = RemoveFront();
        }
        else if (position >= size) {
            throw new IllegalArgumentException("Position out of bounds");
        }
        else {
            Node <T> current = front;
            for (int i = 0; i < position-1; i++) {
                current = current.getNext();
            }
            Node <T> next = current.getNext();
            Node <T> next_next = next.getNext();
            next = null;
            current.setNext(next_next);
            if (next_next != null) {
                next_next.setPrevious(current);
            }
            size--;
            result = true;
        }
        return result;
    }

    @Override
    public boolean Remove(Object obj) 
    {
        boolean result = false;
        
        if(!IsEmpty())
        {
            if(obj.equals(front.getValue()))
            {
                result = RemoveFront();
            }
            else if(obj.equals(back.getValue()))
            {
                result = RemoveEnd();
            }
            else
            {
                Node<T> temp, temp2, temp3;
                
                temp = front;
                while(temp.getNext() != null && !(temp.getValue().equals(obj)))
                {
                    temp = temp.getNext();
                }
                if(temp.getValue().equals(obj))
                {
                    temp2 = temp.getPrevious();
                    temp3 = temp.getNext();
                    
                    temp2.setNext(temp3);
                    temp3.setPrevious(temp2);
                    
                    temp.setNext(null);
                    temp.setPrevious(null);
                    size--;
                    result = true;                                              
                }
                    
            }
        }
        
        return result;
    }

    /*
    YOUR HOMEWORK
    */
    @Override
    public boolean RemoveAll(Object obj) 
    {
        boolean result = false;
        Node <T> current = front;
        int position = 0;
        while (current != null) {  
            if (current.getValue() == (T)obj) {
                RemoveAt(position);
                position--;
            }
            current = current.getNext();
            position++;
        }
        result = true;
        return result;
    }

    @Override
    public Object GetValue(int position) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object GetValueEnd() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object GetValueFront() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() 
    {
        String list = "";
        Node<T> current = front;
        
        list = "LinkedListADT{";
        
        while(current != null)
        {
            list += current.getValue() + "\n";
            current = current.getNext();
        }//End while
        
        list += "}";
        
        return list;
    }
}//End LinkedListADT
