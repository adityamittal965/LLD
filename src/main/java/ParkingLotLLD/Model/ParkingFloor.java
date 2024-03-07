package ParkingLotLLD.Model;

import ParkingLotLLD.Model.ParkingSpot.*;
import ParkingLotLLD.Model.Vehicle.Vehicle;

import java.util.HashMap;

public class ParkingFloor {
    private String name;
    private HashMap<String, HandicappedSpot> handicappedSpots;
    private HashMap<String, CompactSpot> compactSpots;
    private HashMap<String, LargeSpot> largeSpots;
    private HashMap<String, MotorbikeSpot> motorbikeSpots;
    private HashMap<String, ElectricSpot> electricSpots;
    private HashMap<String, CustomerInfoPanel> infoPortals;
    private ParkingDisplayBoard displayBoard;

    private int freeHandicappedSpotCount ;
    private int freeCompactSpotCount ;
    private int freeLargeSpotCount ;
    private int freeMotorbikeSpotCount ;
    private int freeElectricSpotCount ;

    public ParkingFloor(String name) {
        this.name = name;
    }

    public void addParkingSpot(ParkingSpot spot) {
        ParkingSpotFactory parkingSpotFactory = new ParkingSpotFactory() ;
        switch (spot.getType()) {
            case HANDICAPPED:
                handicappedSpots.put(spot.getNumber(), (HandicappedSpot) spot);
                break;
            case COMPACT: ;
                compactSpots.put(spot.getNumber(), (CompactSpot) spot);
                break;
            case LARGE: ;
                largeSpots.put(spot.getNumber(),(LargeSpot) spot);
                break;
            case MOTORBIKE:
                motorbikeSpots.put(spot.getNumber(),(MotorbikeSpot) spot);
                break;
            case ELECTRIC:
                electricSpots.put(spot.getNumber(), (ElectricSpot) spot);
                break;
            default:
                System.out.println("Wrong parking spot type!");
        }
    }

    public void assignVehicleToSpot(Vehicle vehicle, ParkingSpot spot) {
        spot.assignVehicle(vehicle);
        switch (spot.getType()) {
            case HANDICAPPED:
                updateDisplayBoardForHandicapped(spot);
                break;
            case COMPACT:
                updateDisplayBoardForCompact(spot);
                break;
            case LARGE:
                updateDisplayBoardForLarge(spot);
                break;
            case MOTORBIKE:
                updateDisplayBoardForMotorbike(spot);
                break;
            case ELECTRIC:
                updateDisplayBoardForElectric(spot);
                break;
            default:
                System.out.println("Wrong parking spot type!");
        }
    }

    private void updateDisplayBoardForHandicapped(ParkingSpot spot) {
        if (this.displayBoard.getHandicappedFreeSpot().getNumber() == spot.getNumber()) {
            // find another free handicapped parking and assign to displayBoard
            for (String key : handicappedSpots.keySet()) {
                if (handicappedSpots.get(key).isFree()) {
                    this.displayBoard.setHandicappedFreeSpot(handicappedSpots.get(key));
                }
            }
            this.displayBoard.showEmptySpotNumber();
        }
    }

    private void updateDisplayBoardForCompact(ParkingSpot spot) {
        if (this.displayBoard.getCompactFreeSpot().getNumber() == spot.getNumber()) {
            // find another free compact parking and assign to displayBoard
            for (String key : compactSpots.keySet()) {
                if (compactSpots.get(key).isFree()) {
                    this.displayBoard.setCompactFreeSpot(compactSpots.get(key));
                }
            }
            this.displayBoard.showEmptySpotNumber();
        }
    }
    private void updateDisplayBoardForMotorbike(ParkingSpot spot) {
        if (this.displayBoard.getMotorbikeFreeSpot().getNumber() == spot.getNumber()) {
            // find another free compact parking and assign to displayBoard
            for (String key : motorbikeSpots.keySet()) {
                if (motorbikeSpots.get(key).isFree()) {
                    this.displayBoard.setMotorbikeFreeSpot(motorbikeSpots.get(key));
                }
            }
            this.displayBoard.showEmptySpotNumber();
        }
    }
    private void updateDisplayBoardForLarge(ParkingSpot spot) {
        if (this.displayBoard.getLargeFreeSpot().getNumber() == spot.getNumber()) {
            // find another free compact parking and assign to displayBoard
            for (String key : largeSpots.keySet()) {
                if (largeSpots.get(key).isFree()) {
                    this.displayBoard.setLargeFreeSpot(largeSpots.get(key));
                }
            }
            this.displayBoard.showEmptySpotNumber();
        }
    }

    private void updateDisplayBoardForElectric(ParkingSpot spot) {
        if (this.displayBoard.getElectricFreeSpot().getNumber() == spot.getNumber()) {
            // find another free compact parking and assign to displayBoard
            for (String key : electricSpots.keySet()) {
                if (electricSpots.get(key).isFree()) {
                    this.displayBoard.setElectricFreeSpot(electricSpots.get(key));
                }
            }
            this.displayBoard.showEmptySpotNumber();
        }
    }

    public void freeSpot(ParkingSpot spot) {
        spot.removeVehicle();
        switch (spot.getType()) {
            case HANDICAPPED:
                freeHandicappedSpotCount++;
                break;
            case COMPACT:
                freeCompactSpotCount++;
                break;
            case LARGE:
                freeLargeSpotCount++;
                break;
            case MOTORBIKE:
                freeMotorbikeSpotCount++;
                break;
            case ELECTRIC:
                freeElectricSpotCount++;
                break;
            default:
                System.out.println("Wrong parking spot type!");
        }
    }

    public boolean isFull(){
        if(freeLargeSpotCount > 0)
            return true ;
        if(freeMotorbikeSpotCount > 0)
            return true ;
        if(freeLargeSpotCount > 0)
            return true ;
        if(freeHandicappedSpotCount > 0)
            return true ;
        if(freeElectricSpotCount > 0)
            return true ;
        return false ;
    }

}
