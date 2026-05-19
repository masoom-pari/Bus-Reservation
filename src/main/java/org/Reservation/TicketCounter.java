package org.Reservation;

public class TicketCounter {

    private int availableSeats = 3;

    public void  bookTicket(String pname, int numberOfSeats) {
        if ((availableSeats >= numberOfSeats) && (numberOfSeats > 0)) {
            System.out.println("Hi , " + pname + " : " + numberOfSeats + " seats booked sucessfully ..");
            availableSeats = availableSeats - numberOfSeats;
        }else
            System.out.println(" HI, " + pname + " : SEATS NOT AVAILABLE");

    }
}
