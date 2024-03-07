package CoffeeMachineLLD.Model.Coffee;

import lombok.Getter;

@Getter
public abstract class Coffee {
    String description ;
    public abstract float getCost() ;
}

