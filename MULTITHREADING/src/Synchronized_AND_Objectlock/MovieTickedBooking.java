package Synchronized_AND_Objectlock;

class MovieTicketBooking {

    private boolean seatAvailable = true;

    public void bookSeat(String userName) {

        synchronized (this) {

            if (seatAvailable) {

                System.out.println(userName + " is booking the seat..");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                seatAvailable = false;

                System.out.println(userName + " successfully booked the seat.");

            } else {

                System.out.println(
                        userName + " failed, seat is already booked"
                );
            }
        }
    }
}

public class MovieTickedBooking {

    public static void main(String[] args) {

        MovieTicketBooking booking = new MovieTicketBooking();

        Thread user1 = new Thread(
                () -> booking.bookSeat("user-1")
        );

        Thread user2 = new Thread(
                () -> booking.bookSeat("user-2")
        );

        user1.start();
        user2.start();
    }
}