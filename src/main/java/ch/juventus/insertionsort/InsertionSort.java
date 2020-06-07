package ch.juventus.insertionsort;

import java.util.Arrays;
import java.util.List;

public class InsertionSort {


    public static void runSortingAlgorithm() {


        // Prepare list to sort
        List<Integer> list = Arrays.asList(4, 3, 2, 10, 12, 1, 5, 6);

        // Loop over list
        for (int currentIndex = 1; currentIndex < list.size(); currentIndex++) {

            int currentElement = list.get(currentIndex);
            int previousIndex = currentIndex - 1;

            // Move current element to the correct position
            while (previousIndex >= 0 && list.get(previousIndex) > currentElement) {
                // if previous value was bigger, move value one index up
                list.set(previousIndex + 1, list.get(previousIndex));
                previousIndex--; // will be -1 in the last loop
            }
            //set the current element after after a smaller one
            list.set(previousIndex + 1, currentElement);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
