package com.company;

public class Flight {
    private String destination;
    private int hours;
    private int mins;

    // constructor with key components of the Flight class
    public Flight(String destination, int hours, int mins) {
        this.destination = destination;
        this.hours = hours;
        this.mins = mins;
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
