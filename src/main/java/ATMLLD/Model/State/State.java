package ATMLLD.Model.State;

import ATMLLD.Model.ATM;
import ATMLLD.Model.TransactionType;
import ATMLLD.Model.User.Card;

public abstract class State {

    // changes ATM State from IdleState to HasCardState
    public void insertCard(ATM atm, Card card) {
        System.out.println("OOPS!! Something went wrong");
    }

    /// changes ATM State from HasCardState to SelectOperationState
    public void authenticatePin(ATM atm, Card card, int pin){
        System.out.println("OOPS!! Something went wrong");
    }

    // changes ATM State from selectOperationState to CheckBalanceState / CashWithdrawalState
    public void selectOperation(ATM atm, Card card, TransactionType txnType){
        System.out.println("OOPS!! Something went wrong");
    }

    // changes ATM State from cashWithdrawalState to IdleState
    public void cashWithdrawal(ATM atm, Card card, int withdrawAmount){
        System.out.println("OOPS!! Something went wrong");
    }

    // changes ATM State from CheckBalanceState to IdleState
    public void displayBalance(ATM atm, Card card){
        System.out.println("OOPS!! Something went wrong");
    }

    public void returnCard(){
        System.out.println("OOPS!! Something went wrong");
    }

    // Changes ATM State to IdleState
    public void exit(ATM atm){
        System.out.println("OOPS!! Something went wrong");
    }
}
