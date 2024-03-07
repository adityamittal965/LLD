package NotificationServiceLLD.Observer;

import NotificationServiceLLD.Observable.IObservable;

public class User implements IObserver{

    /*
        Reference Variable for observable (There may be different observables like iphone, car etc. for which
        a user has enabled notify me, this observable reference object can be used to tell the subscriber which
        item is back in stock.
    */
    IObservable observable ;

    public User(IObservable observable){
        this.observable = observable ;
    }

    @Override
    public void update(){
        System.out.println("User is notified that iphone is back in stock") ;
    }
}
