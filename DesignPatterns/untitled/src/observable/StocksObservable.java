package observable;

import observer.NotificationObserver;

public interface StocksObservable {
    public void add(NotificationObserver notificationObserver);
    public void remove(NotificationObserver notificationObserver);
    public void notifySubscribers();
    public void setStockCount(int newStockCount);
    public int getStockCount();
}
