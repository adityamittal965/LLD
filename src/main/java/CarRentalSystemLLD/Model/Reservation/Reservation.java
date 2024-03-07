package CarRentalSystemLLD.Model.Reservation;

import CarRentalSystemLLD.Model.Location;
import CarRentalSystemLLD.Model.User;
import CarRentalSystemLLD.Model.Vehicle.Vehicle;
import lombok.Getter;

import java.util.Date;

@Getter
public class Reservation {
    int reservationId;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    Date dateBookedFrom;
    Date dateBookedTo;
    Long fromTimeStamp;
    Long toTimeStamp;
    Location pickUpLocation;
    Location dropLocation;
    ReservationType reservationType;
    ReservationStatus reservationStatus;
    Location location;

    public int createReserve(User user, Vehicle vehicle){

        //generate new id
        reservationId = 12232;
        this.user=user;
        this.vehicle=vehicle;
        reservationType = ReservationType.DAILY;
        reservationStatus = ReservationStatus.SCHEDULED;

        return reservationId;
    }

    // CRUD operations

}
