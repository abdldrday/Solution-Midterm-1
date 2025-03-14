package Online_Payment_Gateway;

import Coffee_Shop.Coffee;
import Coffee_Shop.CoffeeTypes;

public class PaymentFactory implements PaymentMethod{
    public static PaymentMethod createPaymentMethod(String type){
        return switch (type){
            case "creditcard" -> new CreditCardPayment();
            case "paypal" -> new PayPalPayment();
            case "crypto" -> new CryptoPayment();
            default -> throw new IllegalArgumentException("Unknown payment method");
        };
}
