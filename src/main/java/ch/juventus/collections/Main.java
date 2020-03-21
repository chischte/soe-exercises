package ch.juventus.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        CollectionExample collectionExample = new CollectionExample();


        // create Integer array
        Integer myIntegerArray[] = {5, 1010, 7, 88, 89, 380, 3, 2};
        System.out.println(Arrays.toString(myIntegerArray));

        // create integer hash set
       Set<Integer> myIntSet = new HashSet<>(Arrays.asList(myIntegerArray));
        // print hash set
        collectionExample.printHashSet(myIntSet);

        // create String array
        String myStringArray[] = {"x", "x", "zz top", "44","455","46","Zuerich", "0", "_", "this", "isz", "is", "is", "very", "new"};
        System.out.println("This is the Array:   " + Arrays.toString(myStringArray));

        // create string hash set (unsorted):
        Set<String> myStringSet = new HashSet<>((Arrays.asList(myStringArray)));
        // print string hash set
        collectionExample.printHashSet(myStringSet);

        // create string tree set (sorted):
        Set<String> myStringTreeSet = new TreeSet<>((Arrays.asList(myStringArray)));
        // print string tree set:
        collectionExample.printTreeSet(myStringTreeSet);

    }

}
