package observer;

import observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationObserver{
    String emailId;
    StocksObservable stocksObservable;
    public EmailAlertObserverImpl(String emailId, StocksObservable stocksObservable){
        this.emailId = emailId;
        this.stocksObservable = stocksObservable;
    }
    @Override
    public void update(){
        sendMail(emailId, "Product is in stock hurry up!!!");
    }

    public void sendMail(String email, String message){
        System.out.println("user notified via email: "+emailId);
    }
}
