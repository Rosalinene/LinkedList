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
package linkedlistexample;

import linkedlist.LinkedListADT;
import person.Person;

public class LinkedListExample 
{
    public static void main(String[] args) 
    {
        LinkedListADT<Integer> myList = new LinkedListADT<Integer>();
        LinkedListADT<Double> myList2 = new LinkedListADT<Double>();
        //LinkedListADT<Person> myList3 = new LinkedListADT<Person>();

        System.out.println(myList.Size());
        System.out.println(myList.IsEmpty());
        myList.AddFront(2);
        myList.Append(5);
        myList.Append(10);
        myList.Append(15); 
        myList.AddFront(1);
        myList.Append(5);
        // System.out.println(myList.Size());
        // System.out.println(myList.IsEmpty());
        System.out.println("Before insert at first, middle and last position:");
        System.out.println(myList);
        myList.Insert(100, 0);
        myList.Insert(200, myList.Size() / 2);
        myList.Insert(300, myList.Size());
        System.out.println("After insert at first, middle and last position:");
        System.out.println(myList);

        myList.RemoveAt(0);
        System.out.println("After remove at first position:");
        System.out.println(myList);
        myList.RemoveAt(myList.Size() / 2);
        System.out.println("After remove at middle position:");
        System.out.println(myList);
        myList.RemoveAt(myList.Size()-1);
        System.out.println("After remove at last position:");
        System.out.println(myList);
        myList.RemoveAll(5);
        System.out.println("After remove all number 5s");
        System.out.println(myList);
        
        boolean result;
        /*result = myList.RemoveEnd();
        System.out.println(result);
        System.out.println(myList);
        result = myList.RemoveFront();
        System.out.println(result);
        System.out.println(myList);*/
        
        myList.Remove(5);
        System.out.println(myList);
        myList.Remove(1);
        System.out.println(myList);
        myList.Remove(15);
        System.out.println(myList);
        myList.Remove(15);
        System.out.println(myList);
        myList2.Remove(15);
        System.out.println(myList2);
    }
}
