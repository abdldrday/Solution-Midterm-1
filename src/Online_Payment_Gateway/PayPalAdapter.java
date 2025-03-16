package Online_Payment_Gateway;

class ExternalPayPalAPI {
    public void makeTransaction(double amount) {
        System.out.println("External PayPal API processing transaction of $" + amount);
    }
}

public class PayPalAdapter implements PaymentMethod{
    private ExternalPayPalAPI externalPayPalAPI;

    public PayPalAdapter(){
        this.externalPayPalAPI = new ExternalPayPalAPI();
    }

    public void processPayment(double amount) {
        externalPayPalAPI.makeTransaction(amount);
    }

}
