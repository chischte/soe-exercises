package ch.juventus.personaddress;

public class Person {
    private String firstName;
    private String lastName;
    private Address address;
    private int id;

    public Person(int id) {
    this.id=id;
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
        System.out.println( this.id + " Name: " + this.firstName);
        System.out.println(this.id + " Last Name: " + this.lastName);
        String addressInfo = this.address.getAddress();
        System.out.println(this.id + " Address: " + addressInfo);
    }

}
