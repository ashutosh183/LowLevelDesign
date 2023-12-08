package observable;

import observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{
    List<NotificationObserver> notificationObserverList = new ArrayList<>();
    int stockCount = 0;
    @Override
    public void add(NotificationObserver notificationObserver) {
        notificationObserverList.add(notificationObserver);
    }

    @Override
    public void remove(NotificationObserver notificationObserver) {
        notificationObserverList.remove(notificationObserver);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationObserver notificationObserver: notificationObserverList){
            notificationObserver.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if(stockCount == 0){
            notifySubscribers();
        }
        stockCount += newStockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
