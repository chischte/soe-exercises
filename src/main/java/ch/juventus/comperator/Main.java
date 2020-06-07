package ch.juventus.comperator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person femalePerson = new Person();
        femalePerson.setFirstName("Angelina");
        femalePerson.setLastName("Popolino");
        Address femalePersonAddress = new Address("Schneewitchenweg", "Seidenhausen");
        femalePerson.setAddress(femalePersonAddress);

        Person malePerson = new Person();
        malePerson.setFirstName("Xaver");
        malePerson.setLastName("Faustino");
        Address malePersonAddress = new Address("Hammerstrasse", "Kratzberg");
        malePerson.setAddress(malePersonAddress);

        Person spacePerson = new Person();
        spacePerson.setFirstName("Qwartz");
        spacePerson.setLastName("Beamsplash");
        Address spacePersonAddress = new Address("Cyberstreet", "Technotown");
        spacePerson.setAddress(spacePersonAddress);

        // CREATE A LIST:
        List<Person> persons = Arrays.asList(
                femalePerson, malePerson, spacePerson
        );

        Collections.sort(persons, new CompareByCity());
        persons.forEach(person -> System.out.println(person.getFirstName() + " " + person.getAddressString()));


    }
}
