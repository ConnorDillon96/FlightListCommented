package com.company;

public class FlightListTest {

    public static void main(String[] args) {
        // create flight list object, with size being set
        FlightList FlightList1 = new FlightList(Input.getInteger("flight list size"));
        String destination;
        int hours, mins;
        int option;

        // Loop until condition (option !=0)
        do {
            option = Input.getInteger("0:quit\n1:add flight\n2:display\n"); // menu options

            switch (option) { // setting up menu selection
                case 0:
                    System.out.println("terminating");
                    break;
                case 1:
                    System.out.println("Add flight");
                    destination = Input.getString("Destination: ");
                    hours = Input.getInteger("Hours");
                    mins = Input.getInteger("minutes");
                    Flight flight1 = new Flight(destination, hours, mins); // create flight object with constructor information
                    FlightList1.addFlight(flight1); // Add flight object to FlightList
                    break;
                case 2:
                    System.out.println("display flight");
                    System.out.println(FlightList1);
                    break;
                default:
                    System.out.println("invalid option, please try again"); // if option is not a switch case default to this
            }
        } while (option != 0); // Loop exit  condition
    }
}
