package VendingMachineLLD.Model.Inventory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    ItemType type;
    int price;
}
