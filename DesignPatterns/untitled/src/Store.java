import observable.IphoneObservableImpl;
import observable.StocksObservable;
import observer.EmailAlertObserverImpl;
import observer.MobileAlertObserverImpl;
import observer.NotificationObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneStockObserver = new IphoneObservableImpl();
        NotificationObserver observerA = new EmailAlertObserverImpl("abc@mail.com", iphoneStockObserver);
        NotificationObserver observerB = new EmailAlertObserverImpl("def@mail.com", iphoneStockObserver);
        NotificationObserver observerC = new MobileAlertObserverImpl("ghi@mail.com", iphoneStockObserver);

        iphoneStockObserver.add(observerA);
        iphoneStockObserver.add(observerB);
        iphoneStockObserver.add(observerC);

        iphoneStockObserver.setStockCount(1000);
    }
}