package ATMLLD.Model.State;

import ATMLLD.Model.ATM;
import ATMLLD.Model.User.Card;

public class CheckBalanceState extends State{
    public CheckBalanceState() {
    }
    @Override
    public void displayBalance(ATM atm, Card card){
        System.out.println("Your Balance is: " + card.getBankBalance());
        exit(atm);
    }
    @Override
    public void exit(ATM atmObject){
        returnCard();
        atmObject.setState(new IdleState());
        System.out.println("Exit happens");
    }
    @Override
    public void returnCard(){
        System.out.println("Please collect your card");
    }
}
