package ParkingLotLLD.Model.ParkingSpot;

import ParkingLotLLD.Model.Vehicle.Vehicle;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class ParkingSpot {
    private String number;
    private boolean free;
    private Vehicle vehicle;
    private final ParkingSpotType type;

    public boolean isFree(){
        return free ;
    }

    public ParkingSpot(ParkingSpotType type) {
        this.type = type;
    }

    public void assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        free = false;
    }

    public void removeVehicle() {
        this.vehicle = null;
        free = true;
    }
}
