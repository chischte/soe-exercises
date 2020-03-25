package ch.juventus.personaddress;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(001);
        Address address = new Address();
        address.setAddress("Haudiweg", "Gauditown");
        person.setNames("Michi", "Notme");
        person.addAddress(address);
        person.printPersonalData();

        // create a second person with identical entries:
        Person samePerson= new Person(002);
        samePerson.setNames("Michi", "Notme");
        samePerson.addAddress(address);
        samePerson.printPersonalData();

        // without @overriding of equals method persons with same entries
        // return equals false! (because they have different memory allocation)
        System.out.println("person equals samePerson: " + person.equals(samePerson));



    }
}
