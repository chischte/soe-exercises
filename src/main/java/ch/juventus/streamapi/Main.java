package ch.juventus.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        Person personOne = new Person();
        personOne.setName("Hans Schaudi");
        personOne.setAge(111);

        Person personTwo = new Person();
        personTwo.setName("Robert Kovalski");
        personTwo.setAge(121);

        Person personThree = new Person();
        personThree.setName("Anna Haudi");
        personThree.setAge(35);

        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(personOne);
        personList.add(personTwo);
        personList.add(personThree);


        boolean resultPersons = personList.stream()
                .filter(c -> !c.getName().startsWith("A"))
                .allMatch(a -> a.getAge() > 18);

        System.out.println(resultPersons);


        //resultPersons.forEach(n -> System.out.println(n.getName()));


    }
}

