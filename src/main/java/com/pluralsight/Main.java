package com.pluralsight;

public class Main {
    public static void main(String[] args){


        Room r = new Room();

        System.out.println(r);


        Room r2 = new Room(2, 180, true, true);

        System.out.println(r2);



        Reservation res1 = new Reservation();
        res1.setNumberOfNights(2);
        res1.setRoomType("king");
        res1.setWeekend(true);

        System.out.println(res1.getPrice());

        System.out.println(res1.getReservationTotal());

    }
}
