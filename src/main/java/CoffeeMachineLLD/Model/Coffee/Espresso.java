package CoffeeMachineLLD.Model.Coffee;

public class Espresso extends Coffee{
    public Espresso(){
        this.description = "Espresso" ;
    }

    public float getCost(){
        return 1.5f ;
    }
}
