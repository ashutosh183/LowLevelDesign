public class PurchaseFlowManagerUtility {
    public static void main(String[] args) {
        PurchaseFlowManager purchaseFlowManager = new PurchaseFlowManager(new DebitCardPayment(), new EmailNotification());
        purchaseFlowManager.triggerPurchase(100, 46272);

        System.out.println(" ------ ");

        PurchaseFlowManager alternatePurchaseFlowManager = new PurchaseFlowManager(new UPIPayment(), new SMSNotification());
        alternatePurchaseFlowManager.triggerPurchase(12, 46272);
    }
}