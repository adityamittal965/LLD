package ATMLLD.Model;

import ATMLLD.Model.User.Card;
import ATMLLD.Model.User.User;
import ATMLLD.Model.User.UserBankAccount;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ATMRoom {
    ATM atm;
    User user;

    public ATMRoom(){
        this.initialize() ;
    }
    private void initialize() {

        //create ATM
        atm = ATM.getATMObject();
        atm.setAtmBalance(3500, 1,2,5);

        //create User
        this.user = createUser();
    }

    private User createUser(){
        User user = new User();
        user.setCard(createCard());
        return user;
    }

    private Card createCard(){
        Card card = new Card();
        card.setBankAccount(createBankAccount());
        return card;
    }

    private UserBankAccount createBankAccount() {
        UserBankAccount bankAccount = new UserBankAccount();
        bankAccount.setBalance(3000);
        return bankAccount;
    }
}
