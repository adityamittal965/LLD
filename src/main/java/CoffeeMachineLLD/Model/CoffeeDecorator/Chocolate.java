package CoffeeMachineLLD.Model.CoffeeDecorator;

import CoffeeMachineLLD.Model.Coffee.Coffee;

public class Chocolate extends CoffeeDecorator{
    Coffee wrappedCoffee ;

    public Chocolate(Coffee wrappedCoffee){
        this.wrappedCoffee = wrappedCoffee ;
    }
    public float getCost(){
        return 0.3f + wrappedCoffee.getCost() ;
    }
}
