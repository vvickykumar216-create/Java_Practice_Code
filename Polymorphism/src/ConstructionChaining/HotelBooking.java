package ConstructionChaining;

public class HotelBooking {
    String guestName;
    int roomNo;
    int days;

    // Constructor 1
    HotelBooking() {
        this("Unknown");
        System.out.println("Default booking created");
    }

    // Constructor 2
    HotelBooking(String name) {
        this(name, 101);
        System.out.println("Guest name added");
    }

    // Constructor 3
    HotelBooking(String name, int room) {
        this(name, room, 1);
        System.out.println("Room number added");
    }

    // Constructor 4
    HotelBooking(String name, int room, int d) {
        guestName = name;
        roomNo = room;
        days = d;
        System.out.println("All booking details added");
    }
}

 class Main {

    public static void main(String[] args) {

        HotelBooking h = new HotelBooking("Rahul");
    }
}


