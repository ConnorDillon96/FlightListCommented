package com.company;

public class Flight implements Comparable<Flight> { // notice the implements for the sorting

    private String destination;
    private Integer hours; // must be object types as (int) will throw an error using compare to method
    private Integer mins;

    // constructor with key components of the Flight class
    public Flight(String destination, Integer hours, Integer mins) {
        this.destination = destination;
        this.hours = hours;
        this.mins = mins;
    }

    public int compareTo(Flight flight) {
        int result;
        //this.destination = index 2
        //flight.destination = index 1
        result = this.hours.compareTo(flight.hours); // result will be 1 or -1
        //this.flight is the current objects hour in the iteration, where flight.hours is the next in the iteration
        if (result == 0) { // if result is 0 (hours were the same, now compare the mins)
            result = this.mins.compareTo(flight.mins);
        }
        if (result == 0) { // compare the locations if the times are matching
            result = this.destination.compareTo(flight.destination);
        }
        return result;
    }



    // Crucial to ensure that we are not presented memory locations when printing the Flight object from the FlightList
    public String toString(){
        String flightDetails=new String();
        String timeString = "";
        if(this.hours<10)
            timeString+="0";
        timeString+=this.hours+":";
        if(this.mins<10)
            timeString+="0";
        timeString+=this.mins;

        flightDetails+= this.destination;

        flightDetails = String.format("%-20s%s", timeString, flightDetails); // formatting output
        return flightDetails;
    }

}
