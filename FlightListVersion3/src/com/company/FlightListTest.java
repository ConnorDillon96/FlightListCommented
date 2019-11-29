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
                    hours = getValue("Hours", 0,23); //passing values for validation and setting boundaries
                    mins = getValue("minutes", 0, 59);
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

    private static int getValue(String prompt, int min, int max){ //Exception handling function to deal with invalid times
        int value;
        Boolean valid = false;// condition for do
        class ValueNotInRangeException extends Exception{// extending a java base class with custom exception
        }
        do{ // repeating until boolean value is true
            value = Input.getInteger(prompt);
            try{
                if (value<min || value> max){ // check for out oif bounds exception
                    throw new ValueNotInRangeException(); // throw exception
                }
                else{
                    valid = true; // valid range condition switched
                }
            }catch (ValueNotInRangeException e){ //exception thrown condition
                System.out.println(value + "outwith the range "+min+"-"+max);
            }
        }while (!valid); //repeating condition
        return value; // if inputs pass screening return the value
    }
}
