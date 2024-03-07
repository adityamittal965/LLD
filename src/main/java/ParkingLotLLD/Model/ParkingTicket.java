package ParkingLotLLD.Model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ParkingTicket {
    String ticketNumber ;
    Date issuedAt ;
    Date payedAt ;
    double paidAmount ;
    ParkingTicketStatus status ;

    public void saveInDB(){

    }
}
