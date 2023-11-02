public class EmailNotification implements NotificationSender{
    @Override
    public void sendNotification(int productId, int customerId){
        System.out.println("Notifcation has been sent for product id "+productId+" for the customer id "+customerId+" through email.");
    }
}
