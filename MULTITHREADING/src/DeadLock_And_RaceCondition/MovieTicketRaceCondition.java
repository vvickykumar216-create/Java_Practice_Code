package DeadLock_And_RaceCondition;

/**

class MovieTicketBooking {
    int availableTicket = 1;
    void bookTicket(String user) {
        if (availableTicket > 0) {
            System.out.println(user + " is trying to book ticket...");
            try {
                Thread.sleep(100);
            }catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            availableTicket--;
            System.out.println(user + " book the ticket..");
        }else {
            System.out.println(user + " failed. no ticket available..");
        }
    }
}
public class MovieTicketRaceCondition {
    static void main(String[] args) {
        MovieTicketBooking booking = new MovieTicketBooking();
        Thread user1 = new Thread(() -> booking.bookTicket("User-1"));
        Thread user2 = new Thread(() -> booking.bookTicket("User-2"));

        user1.start();
        user2.start();
    }
}
*/

class MovieTicketBooking {

    int availableTickets = 1;

    synchronized void bookTicket(String user) {

        if (availableTickets > 0) {

            System.out.println(user + " is trying to book ticket...");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            availableTickets--;

            System.out.println(user + " booked the ticket.");

        } else {

            System.out.println(user + " failed. No ticket available.");
        }
    }
}

public class MovieTicketRaceCondition {

    public static void main(String[] args) {

        MovieTicketBooking booking = new MovieTicketBooking();

        Thread user1 = new Thread(
                () -> booking.bookTicket("User-1")
        );

        Thread user2 = new Thread(
                () -> booking.bookTicket("User-2")
        );

        user1.start();
        user2.start();
    }
}