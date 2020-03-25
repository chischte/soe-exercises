package ch.juventus.personaddress;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, address);
    }
}
