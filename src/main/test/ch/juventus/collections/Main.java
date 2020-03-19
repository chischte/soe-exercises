package ch.juventus.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        CollectionExample collectionExample = new CollectionExample();


        // create Integer array
        Integer myIntegerArray[] = {5, 6, 7, 8, 4, 3, 3, 2};
        // create integer hash set
        Set<Integer> myIntSet = new HashSet<>(Arrays.asList(myIntegerArray));
        // print hash set
        collectionExample.printHashSet(myIntSet);

        // create String array
        String myStringArray[] = {"this", "is","is","is", "very", "new"};
        // create string hash set
        Set<String> myStringSet = new HashSet<>((Arrays.asList(myStringArray)));
        // print string hash set
        collectionExample.printHashSet(myStringSet);

    }

}
