package ch.juventus.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ExampleFindAny {

    public static void main(String[] args) {
        List<String> exampleStrings = new ArrayList();
        exampleStrings.add("a");
        exampleStrings.add("b");
        exampleStrings.add("c");
        exampleStrings.add("d");

        // Find "a"
        Optional<String> searchForA = exampleStrings.stream()
                .filter(str -> str.equals("a"))
                .findFirst();

        //searchForA.ifPresent(System.out::println);
        System.out.println(searchForA.orElse("No \"a\" found"));

        // Find "z"
        Optional<String> searchForZ = exampleStrings.stream()
                .filter(str -> str.equals("z"))
                .findFirst();

        //searchForZ.ifPresent(System.out::println);
        System.out.println(searchForZ.orElse("No \"z\" found"));
    }
}
