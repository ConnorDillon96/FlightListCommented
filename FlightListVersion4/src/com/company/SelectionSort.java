package com.company;

public class SelectionSort {

    public static void sort(Comparable[] values) {
        /* algorithm
            for each object in the array excluding the last object loop // first object
                for each remaining object in the array loop // current object
                    if the current object is less than the first object then
                        swap objects
                    end if
                end loop
            end loop
         */
        Comparable temp;
        Integer size = ArrayUtility.getNumberOfObjects(values);
        for (Integer first = 0; first < size - 1; first++) { // iterate through full array excluding last index position
            for (Integer current = first + 1; current < size; current++) { // for each object in the array
                if (values[current].compareTo(values[first]) < 0) { //comparing current object vs next object // if < 0 swap
                    temp = values[first]; //temp holds first value
                    values[first] = values[current]; // first value replaces current value in the array
                    values[current] = temp; // where current value was is replaced with the temp value
                }
            }
        }
    }
}
