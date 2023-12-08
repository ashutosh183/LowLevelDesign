package observer;

import observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationObserver{
    String phoneNumber;
    StocksObservable stocksObservable;
    public MobileAlertObserverImpl(String phoneNumber, StocksObservable stocksObservable){
        this.phoneNumber = phoneNumber;
        this.stocksObservable = stocksObservable;
    }
    @Override
    public void update(){
        sendSms(phoneNumber, "product is in stock hurry up!!!");
    }

    public void sendSms(String phoneNumber, String messgae){
        System.out.println("SMS has been sent to the user: "+phoneNumber);
    }
}
