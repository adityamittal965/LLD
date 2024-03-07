package CoffeeMachineLLD.Model.CoffeeDecorator;

import CoffeeMachineLLD.Model.Coffee.Coffee;

public class Mocha extends CoffeeDecorator{

    Coffee wrappedCoffee ;

    public Mocha(Coffee wrappedCoffee){
        this.wrappedCoffee = wrappedCoffee ;
    }
    public float getCost(){
        return 0.1f + wrappedCoffee.getCost() ;
    }
}
