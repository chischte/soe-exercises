package ch.juventus.exceptions;

public class Main {
    public static void main(String[] args) {

        PersonRepository personRepository = new PersonRepository();

        // Add persons to repository:
        personRepository.addPerson(2, "Klara");

        // Optional catch IllegalArgumentException:
        try {
            personRepository.addPerson(null, "Hans");
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument exception");
        }

        personRepository.addPerson(3, "Robert");

        System.out.println(personRepository.getPersonRegister());
        //System.out.println(personRepository.getPersonName(1));
        //System.out.println(personRepository.getPersonName(4));

        try {
            personRepository.getPersonName(4);
        } catch (PersonNotFoundException e) {
            System.out.println("Invalid Person Id exception");
        }
    }
}
