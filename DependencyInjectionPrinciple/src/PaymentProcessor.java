public interface PaymentProcessor {
    void makePayment(int productId, int customerId);
}
