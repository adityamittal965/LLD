package BookMyShowLLD.Model;

import BookMyShowLLD.Model.Theatre.Seat;
import BookMyShowLLD.Model.Theatre.Show;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Booking {
    Show show;
    List<Seat> bookedSeats = new ArrayList<>();
    Payment payment;
}
