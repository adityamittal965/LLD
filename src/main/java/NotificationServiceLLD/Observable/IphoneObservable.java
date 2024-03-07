package NotificationServiceLLD.Observable;

import NotificationServiceLLD.Observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements IObservable{
    private int stockCount = 0 ;
    private List<IObserver> list = new ArrayList<>() ;

    @Override
    public void add(IObserver observer){
        list.add(observer) ;
    }

    @Override
    public void remove(IObserver observer){
        list.remove(observer) ;
    }

    @Override
    public void setStockCount(int stockCount){
        if(this.stockCount == 0)
            this.notifyObservers();
        this.stockCount = stockCount ;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

    @Override
    public void notifyObservers(){
        for(IObserver observer: list){
            observer.update();
        }
    }
}
