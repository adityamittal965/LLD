package ATMLLD.Model.State;

import ATMLLD.Model.ATM;
import ATMLLD.Model.CashWithdrawProcessor.CashWithdrawProcessor;
import ATMLLD.Model.CashWithdrawProcessor.FiveHundredWithdrawProcessor;
import ATMLLD.Model.CashWithdrawProcessor.OneHundredWithdrawProcessor;
import ATMLLD.Model.CashWithdrawProcessor.TwoHundredWithdrawProcessor;
import ATMLLD.Model.User.Card;

public class CashWithdrawalState extends State{
    public CashWithdrawalState() {
        System.out.println("Please enter the Withdrawal Amount");
    }
    public void cashWithdrawal(ATM atmObject, Card card, int withdrawalAmountRequest) {
        if (atmObject.getAtmBalance() < withdrawalAmountRequest) {
            System.out.println("Insufficient fund in the ATM Machine");
            exit(atmObject);
        } else if (card.getBankBalance() < withdrawalAmountRequest) {
            System.out.println("Insufficient fund in the your Bank Account");
            exit(atmObject);
        } else {
            card.deductBankBalance(withdrawalAmountRequest);
            atmObject.deductATMBalance(withdrawalAmountRequest);

            // using chain of responsibility for this logic, how many 2k Rs notes, how many 500 Rs notes etc, has to be withdrawal
            CashWithdrawProcessor withdrawProcessor =
                    new TwoHundredWithdrawProcessor(new FiveHundredWithdrawProcessor(new OneHundredWithdrawProcessor(null)));

            withdrawProcessor.withdraw(atmObject, withdrawalAmountRequest);
            exit(atmObject);
        }
    }
    @Override
    public void exit(ATM atmObject) {
        returnCard();
        atmObject.setState(new IdleState());
        System.out.println("Exit happens");
    }
    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }

}
