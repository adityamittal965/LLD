package CoffeeMachineLLD.Model.CoffeeDecorator;

import CoffeeMachineLLD.Model.Coffee.Coffee;

public class Milk extends CoffeeDecorator{
    Coffee wrappedCoffee ;

    public Milk(Coffee wrappedCoffee){
        this.wrappedCoffee = wrappedCoffee ;
    }
    public float getCost(){
        return 0.2f + wrappedCoffee.getCost() ;
    }
}
