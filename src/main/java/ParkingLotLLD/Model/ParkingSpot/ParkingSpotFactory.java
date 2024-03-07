package ParkingLotLLD.Model.ParkingSpot;

public class ParkingSpotFactory{

    public ParkingSpot getParkingSpot(ParkingSpotType spotType){
        switch(spotType){
            case HANDICAPPED -> {
                return new HandicappedSpot() ;
            }
            case COMPACT -> {
                return new CompactSpot() ;
            }
            case ELECTRIC -> {
                return new ElectricSpot() ;
            }
            case LARGE -> {
                return new LargeSpot() ;
            }
            case MOTORBIKE -> {
                return new MotorbikeSpot() ;
            }
            default -> {
                return null ;
            }
        }
    }
}
