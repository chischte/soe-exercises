package ch.juventus.personaddress;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Address address = new Address();
        address.setAddress("Haudiweg", "Gauditown");
        person.setNames("Michi", "Notme");
        person.addAddress(address);
        person.printPersonalData();

    }
}
