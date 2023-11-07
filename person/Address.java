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

public class Address 
{
    protected String street;
    protected String city;
    protected String state;
    protected String zipcode;

    public Address(String street, String city, String state, String zipcode) 
    {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }//End constructor

    @Override
    public String toString() 
    {
        return "Address{" + "street=" + street + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + '}';
    }//End toString()
    
    public String getStreet() 
    {
        return street;
    }//End getStreet()

    public void setStreet(String street) 
    {
        this.street = street;
    }//End setStreet

    public String getCity() 
    {
        return city;
    }//End getCity()

    public void setCity(String city) 
    {
        this.city = city;
    }//End setCity

    public String getState() 
    {
        return state;
    }//End getState()

    public void setState(String state) 
    {
        this.state = state;
    }//End setState

    public String getZipcode() 
    {
        return zipcode;
    }//End getZipcode() 

    public void setZipcode(String zipcode) 
    {
        this.zipcode = zipcode;
    }//End setZipcode
}//End Address 

