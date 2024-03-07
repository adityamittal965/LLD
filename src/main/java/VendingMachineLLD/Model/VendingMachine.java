package VendingMachineLLD.Model;

import VendingMachineLLD.Model.Inventory.Inventory;
import VendingMachineLLD.Model.State.IdleState;
import VendingMachineLLD.Model.State.State;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class VendingMachine {
    State state ;
    Inventory inventory ;
    List<Coin> coinList ;

    public VendingMachine(){
        this.state = new IdleState();
        inventory = new Inventory(10);
        coinList = new ArrayList<>();
    }
}
