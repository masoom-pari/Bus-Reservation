package org.Reservation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[]   )  {
        TicketCounter ticketCounter= new TicketCounter();
        TicketBookingThread t1 = new TicketBookingThread(ticketCounter , "Guilbert", 2);
        TicketBookingThread t2 = new TicketBookingThread( ticketCounter , "aliyah", 2);

        t1.start();
        t2.start();

    }
}