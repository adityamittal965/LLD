package BookMyShowLLD.Model.Theatre;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seat {
    int seatId;
    int row;
    SeatCategory seatCategory;
}
