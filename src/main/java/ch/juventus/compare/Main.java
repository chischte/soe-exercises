package ch.juventus.compare;

public class Main {
    public static void main(String[] args){
        Person femalePerson = new Person();
        Person malePerson=new Person();

        Address femalePersonAddress=new Address("Schneewitchenweg", "Seidenhausen");
        femalePerson.setFirstName("Angelina");
        femalePerson.setLastName("Popolino");
        femalePerson.setAddress(femalePersonAddress);

        Address malePersonAddress=new Address("Hammerstrasse", "Kratzberg");
        malePerson.setFirstName("Xaver");
        malePerson.setLastName("Faustino");
        malePerson.setAddress(malePersonAddress);

        System.out.print(femalePerson.getAddress());

    }
}
