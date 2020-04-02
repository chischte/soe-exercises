package ch.juventus.exceptions;

import java.util.HashMap;

public class PersonRepository {

    HashMap<Integer, String> personRegister = new HashMap<Integer, String>();

    public void addPerson(Integer personId, String personName) {
        this.personRegister.put(personId, personName);
    }

    public HashMap<Integer, String> getPersonRegister() {
        return personRegister;
    }

    public String getPersonName(Integer id) {
        return this.personRegister.get(id);
    }

}
