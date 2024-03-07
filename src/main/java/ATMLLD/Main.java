package ATMLLD;

import ATMLLD.Model.ATMRoom;
import ATMLLD.Model.TransactionType;

// State Design Pattern (Behavioral)
// Chain of Responsibility Design Pattern (Behavioral)
// Singleton Design Pattern (Creational)
public class Main {

    public static void main(String[] args) {
        /*
             We want just one instance of an 'ATM', therefore we initialize it using Singleton Design Pattern
             (Eager Initialization).
            'ATM' has a 'State'. 'ATMRoom' has an 'ATM' and a 'User'. 'User' has a 'Card' and a 'UserBankAccount'.
             There are 5 states:
             1. IdleState
             2. HasCardState
             3. SelectOperationState
             4. CheckBalanceState
             5. CashWithdrawalState
             cashWithdrawal() method of CashWithdrawalState() uses CashWithdrawalProcessor which is designed
             based on Chain of Responsibility Design Pattern.
        */
        ATMRoom atmRoom = new ATMRoom();

        atmRoom.getAtm().printCurrentATMStatus();
        atmRoom.getAtm().getState().insertCard(atmRoom.getAtm(), atmRoom.getUser().getCard());
        atmRoom.getAtm().getState().authenticatePin(atmRoom.getAtm(), atmRoom.getUser().getCard(), 112211);
        atmRoom.getAtm().getState().selectOperation(atmRoom.getAtm(), atmRoom.getUser().getCard(), TransactionType.CASH_WITHDRAWAL);
        atmRoom.getAtm().getState().cashWithdrawal(atmRoom.getAtm(), atmRoom.getUser().getCard(), 2700);
        atmRoom.getAtm().printCurrentATMStatus();
    }
}
