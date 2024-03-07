package VendingMachineLLD.Model.State;

import VendingMachineLLD.Model.Coin;
import VendingMachineLLD.Model.Inventory.Item;
import VendingMachineLLD.Model.VendingMachine;

import java.util.List;

public interface State {

    // Changes state of VendingMachine from IdleState to HasMoneyState
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception;

    public void insertCoin(VendingMachine machine , Coin coin) throws Exception;

    // Changes state of VendingMachine from HasMoneyState to SelectionState
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception;

    // Changes state of VendingMachine from SelectionState to DispenseState
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception;

    public int getChange(int returnChangeMoney) throws Exception;

    // Changes state of VendingMachine from Dispense State to IdleState
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception;

    // Changes state of VendingMachine from HasMoneyState/SelectionState to IdleState
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception;

    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception;


}
