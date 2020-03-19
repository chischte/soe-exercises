package ch.juventus.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args){
        CollectionExample collectionExample=new CollectionExample();
        collectionExample.printHashSet();

        // create array
        Integer myArray[] = {5,6,7,8,4,3,3,2};

        // create hash set
        Set<Integer> mySet = new HashSet<>(Arrays.asList(myArray));


    }

}
