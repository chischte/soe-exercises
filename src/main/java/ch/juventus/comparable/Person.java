package ch.juventus.comparable;

public class Person implements Comparable<Person>{

    private String lastName;
    private String firstName;
    private Address address;

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        String addressInfo = this.address.getAddress();
        return addressInfo;
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

    @Override
    public int compareTo(Person person) {
        return (this.firstName.compareTo(person.firstName)*-1);
    }
}
