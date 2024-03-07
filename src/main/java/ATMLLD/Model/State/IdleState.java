package ATMLLD.Model.State;

import ATMLLD.Model.ATM;
import ATMLLD.Model.User.Card;

public class IdleState extends State{
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setState(new HasCardState());
    }
}
