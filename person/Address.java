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

/**
 *
 * @author huong
 */
public class Address 
{
    protected String street;
    protected String city;
    protected String state;
    protected String zipcode;

    public Address(String street, String city, String state, String zipcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" + "street=" + street + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + '}';
    }
    
        public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}

