package CarRentalSystemLLD.Model.Payment;

import CarRentalSystemLLD.Model.Reservation.Reservation;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bill {
    Reservation reservation;
    double totalBillAmount;
    boolean isBillPaid;

    public Bill(Reservation reservation) {
        this.reservation = reservation;
        this.totalBillAmount = computeBillAmount();
        isBillPaid = false;
    }

    private double computeBillAmount(){

        return 100.0;
    }

}
