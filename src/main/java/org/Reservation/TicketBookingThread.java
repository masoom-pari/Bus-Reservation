package org.Reservation;

public class TicketBookingThread  extends Thread {
    private final TicketCounter ticketCounter;
    private final String passengerName;
    private  final int noOfSeatsBook;

    public TicketBookingThread(TicketCounter ticketCounter , String passengerName , int noOfSeatsBook){
        this.ticketCounter = ticketCounter;
        this.passengerName = passengerName;
        this.noOfSeatsBook = noOfSeatsBook;
    }
    public void run(){
        ticketCounter.bookTicket(passengerName , noOfSeatsBook);
    }


}
