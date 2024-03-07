package NotificationServiceLLD.Observable;


import NotificationServiceLLD.Observer.IObserver;

// Interface methods are by default public and abstract
public interface IObservable {
    public void add(IObserver observer) ;
    public void remove(IObserver observer) ;
    public void notifyObservers() ;
    public void setStockCount(int stockCount) ;

    public int getStockCount() ;
}
