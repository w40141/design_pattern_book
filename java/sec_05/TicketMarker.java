public class TicketMarker {
    private int ticket = 1000;
    private static TicketMarker ticketMarker = new TicketMarker();

    private TicketMarker(){}

    public static TicketMarker getInstance() {
        return ticketMarker;
    }

    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
