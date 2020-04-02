package ch.juventus.exceptions;

public class Main {
    public static void main(String[] args){

    PersonRepository personRepository=new PersonRepository();
        personRepository.addPerson(1,"Hans");
        personRepository.addPerson(2,"Klara");
        personRepository.addPerson(3, "Robert");

        System.out.println(personRepository.getPersonRegister());

    }
}
