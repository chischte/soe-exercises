package ch.juventus.personaddress;

public class Person {
    private String firstName;
    private String lastName;
    private Address address;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setNames(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void addAddress(Address address) {
        this.address = address;
    }

    public void printPersonalData() {
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        String addressInfo = this.address.getAddress();
        System.out.println("Address: " + addressInfo);
    }

}
