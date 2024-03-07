package ATMLLD.Model.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserBankAccount {
    int balance;
    public void withdrawalBalance(int amount) {
        balance = balance - amount;
    }
}
