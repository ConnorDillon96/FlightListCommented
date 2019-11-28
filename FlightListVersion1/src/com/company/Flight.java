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
        if(this.hours<10)
            flightDetails+="0";
        flightDetails+=this.hours+":";
        if(this.mins<10)
            flightDetails+="0";
        flightDetails+=this.mins;
        flightDetails+=" "+this.destination;
        return flightDetails;
    }

}
