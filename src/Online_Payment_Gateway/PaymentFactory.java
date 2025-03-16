package Online_Payment_Gateway;

public class PaymentFactory {
    public static PaymentMethod createPaymentMethod(String type) {
        return switch (type) {
            case "creditcard" -> new CreditCardPayment();
            case "paypal" -> new PayPalPayment();
            case "crypto" -> new CryptoPayment();
            default -> throw new IllegalArgumentException("Unknown payment method");
        };
    }

}
