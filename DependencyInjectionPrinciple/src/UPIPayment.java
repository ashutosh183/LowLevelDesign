public class UPIPayment implements PaymentProcessor{
    @Override
    public void makePayment(int productId, int customerId){
        System.out.println("Payment has been made for customer id "+customerId+ " for the product id "+productId+" through upi");
    }
}
