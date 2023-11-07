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
package person;

public abstract class Person 
{
    protected String name;
    protected Address homeAddress;
    
    /**
     * This needs a description also.
     * 
     * @param name  a description
     * @param street
     * @param city
     * @param state
     * @param zipcode 
     */
    public Person(String name, String street, String city, 
            String state, String zipcode) 
    {
        this.name = name;
        homeAddress = new Address(street, city, state, zipcode);
        /*this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;*/
    }//End constructor

    public abstract void HelloWorld();
    
    @Override
    public String toString() 
    {
        String msg;
        msg = "Person{" + "name=" + name + ", street=" + 
                homeAddress.getStreet() + ", city=" 
                + homeAddress.getCity() + ", state=" + 
                homeAddress.getState() + ", zipcode=" + 
                homeAddress.getZipcode() + '}';
        //msg += super.toString();
        
        return msg;
    }//End toString()
/**
 * Description
 * @return what is it returnign
 */
    public String getName() 
    {
        return name;
    }//End getName() 

    public void setName(String name) 
    {
        this.name = name;
    }//End setName
}//End Person

