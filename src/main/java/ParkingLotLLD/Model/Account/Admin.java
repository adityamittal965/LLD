package ParkingLotLLD.Model.Account;

import ParkingLotLLD.Model.*;
import ParkingLotLLD.Model.ParkingSpot.ParkingSpot;

public class Admin extends Account {
    public boolean addParkingFloor(ParkingFloor floor){
        return true ;
    }
    public boolean addParkingSpot(String floorName, ParkingSpot spot){
        // implement
        return true ;
    }
    public boolean addParkingDisplayBoard(String floorName, ParkingDisplayBoard displayBoard){
        // implement
        return true ;
    }
    public boolean addCustomerInfoPanel(String floorName, CustomerInfoPanel infoPanel){
        // implement
        return true ;
    }

    public boolean addEntrancePanel(EntrancePanel entrancePanel){
        // implement
        return true ;
    }
    public boolean addExitPanel(ExitPanel exitPanel){
        // implement
        return true ;
    }
}
