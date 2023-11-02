public class PurchaseFlowManager {
    public final PaymentProcessor paymentProcessor;
    public final NotificationSender notificationSender;

    PurchaseFlowManager(PaymentProcessor paymentProcessor, NotificationSender notificationSender){
        this.notificationSender = notificationSender;
        this.paymentProcessor = paymentProcessor;
    }

    public void triggerPurchase(int productId, int customerId){
        paymentProcessor.makePayment(productId, customerId);
        notificationSender.sendNotification(productId, customerId);
    }
}
