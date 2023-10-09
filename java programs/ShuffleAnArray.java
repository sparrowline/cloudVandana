package javaAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleAnArray {
	public static void main(String[] args) {
        // Create the initial list
        List<Integer> myList = new ArrayList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);

        // Shuffle the list
        Collections.shuffle(myList);

        // Print the shuffled list
        System.out.println(myList);
    }
}
