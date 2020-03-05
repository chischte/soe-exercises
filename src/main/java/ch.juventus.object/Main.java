package main.java.ch.juventus.object;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        Address address = new Address();
        address.setStreet("Hasenbuehlweg");

        person.setFirstName("Michael");
        person.setLastName("Wettstein");
        person.setAddress(address);

        System.out.println(person);

    }
}
