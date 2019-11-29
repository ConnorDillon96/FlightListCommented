package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FlightList {
    Flight[] flightList;

    public FlightList(int size) {
        this.flightList =  new Flight[size];
    }

    // add flights to the flight list
    public void addFlight(Flight flightToAdd){
        // check for default unset value
        if (Arrays.asList(flightList).contains(null)){
            // get index
            int index = Arrays.asList(flightList).indexOf(null);
            // add new flight to empty position
            flightList[index] = flightToAdd;
        }
        else{
            System.out.println("list is full");
        }
    }

    //Note. Memory locations are posted if the Flight class does not contain a ToString method
    @Override
    public String toString() {
        System.out.printf("%-20s%s","TIME", "DESTINATION\n"); //printf - formatting output structure
        String flightDetails = "";
        for (Flight i: flightList) { // iterate through the list adding to String
            if (i != null){ // ignores Nulls
                flightDetails += (i + "\n");
            }
        }
        return flightDetails;
    }
}
