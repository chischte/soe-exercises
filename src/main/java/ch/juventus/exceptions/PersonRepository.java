package ch.juventus.exceptions;

import java.util.HashMap;

public class PersonRepository extends Exception {

    HashMap<Integer, String> personRegister = new HashMap<Integer, String>();

    public void addPerson(Integer personId, String personName) {
        this.personRegister.put(personId, personName);
        if (personId == null) {
            throw new IllegalArgumentException("Person Id should not be null");
        }
    }

    public HashMap<Integer, String> getPersonRegister() {
        return personRegister;
    }

    public String getPersonName(Integer id) throws PersonNotFoundException {
        if (this.personRegister.get(id) == null) {
            throw new PersonNotFoundException("Person not found Exception");
        }

        return this.personRegister.get(id);
    }


}
