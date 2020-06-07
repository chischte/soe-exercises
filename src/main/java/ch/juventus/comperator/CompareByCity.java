package ch.juventus.comperator;

import java.util.Comparator;

public class CompareByCity implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        String p1Street=p1.getAddressObject().getCityName();
        String p2Street=p2.getAddressObject().getCityName();
        return p1Street.compareTo(p2Street);
    }
}
