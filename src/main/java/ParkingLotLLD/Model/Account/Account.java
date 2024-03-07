package ParkingLotLLD.Model.Account;

import ParkingLotLLD.Model.Person.Person;

public abstract class Account {
    private String userName;
    private String password;
    private AccountStatus status;
    private Person person;

    public boolean resetPassword(){
        // implement
        return true ;
    };
}
