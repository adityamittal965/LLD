package CoffeeMachineLLD;

import CoffeeMachineLLD.Model.Coffee.Americano;
import CoffeeMachineLLD.Model.Coffee.Coffee;
import CoffeeMachineLLD.Model.CoffeeDecorator.Chocolate;
import CoffeeMachineLLD.Model.CoffeeDecorator.Milk;
import CoffeeMachineLLD.Model.CoffeeDecorator.Mocha;

// Decorator Design Pattern (Structural)
public class Main {

    public static void main(String[] args) {
        Coffee americano = new Americano() ;
        System.out.println(americano.getCost()) ;

        Coffee americanoWithMocha = new Mocha(americano) ;
        System.out.println(americanoWithMocha.getCost()) ;

        Coffee americanoWithMochaAndMilk = new Milk(americanoWithMocha) ;
        System.out.println(americanoWithMochaAndMilk.getCost()) ;

        Coffee americanoWithDoubleMilk = new Milk(new Milk(new Americano())) ;
        System.out.println(americanoWithDoubleMilk.getCost()) ;

        Coffee americanoWithMilkChocolateAndMocha = new Chocolate(new Milk(new Mocha(new Americano()))) ;
        System.out.println(americanoWithMilkChocolateAndMocha.getCost()) ;
    }

}
