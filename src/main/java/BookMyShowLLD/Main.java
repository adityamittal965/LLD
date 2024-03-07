package BookMyShowLLD;

import BookMyShowLLD.Model.Theatre.City;

public class Main {

    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();
        //user1
        bookMyShow.createBooking(City.Bangalore, "BAAHUBALI");
        //user2
        bookMyShow.createBooking(City.Bangalore, "BAAHUBALI");
    }
}
