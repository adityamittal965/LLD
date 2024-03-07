package NotificationServiceLLD;


import NotificationServiceLLD.Observable.IphoneObservable;
import NotificationServiceLLD.Observer.User ;

// Observer Design Pattern (Behavioral)
public class Main {

    public static void main(String[] args) {
        // Creating a new observable
        IphoneObservable iphone = new IphoneObservable() ;

        // Creating new observers
        User user1 = new User(iphone) ;
        User user2 = new User(iphone) ;
        User user3 = new User(iphone) ;

        // Adding observers to the notification list of iphone
        iphone.add(user1) ;
        iphone.add(user2) ;
        iphone.add(user3) ;

        // Updating Stock Count for Iphone
        iphone.setStockCount(10);
        iphone.setStockCount(0);
        iphone.setStockCount(20);

    }
}
