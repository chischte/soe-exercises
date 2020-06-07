package ch.juventus.comperator;

public class Person {

    private String lastName;
    private String firstName;
    private Address address;

    public String getLastName() {
        return lastName;
    }

    public String getAddressString() {
        String addressInfo = this.address.getAddressString();
        return addressInfo;
    }

    public Address getAddressObject() {
        return this.address;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
