package ParkingLotLLD.Model;

import ParkingLotLLD.Model.ParkingSpot.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingDisplayBoard {
    String id ;
    HandicappedSpot handicappedFreeSpot;
    CompactSpot compactFreeSpot ;
    LargeSpot largeFreeSpot ;
    MotorbikeSpot motorbikeFreeSpot ;
    ElectricSpot electricFreeSpot ;

    public void showEmptySpotNumber(){

    }

}
