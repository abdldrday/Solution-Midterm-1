package Online_Payment_Gateway;

import java.util.Scanner;

public class PaymentGatewaySimulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Select a payment method: CreditCard, PayPal, Crypto");
        String method = in.nextLine();

        PaymentMethod payment;
        if (method.equalsIgnoreCase("paypal")) {
            payment = new PayPalAdapter();
        } else {
            payment = PaymentFactory.createPaymentMethod(method);
        }

        System.out.println("Enter payment amount:");
        double amount = in.nextDouble();

        // Создаём объект транзакции
        Transaction transaction = new Transaction(method, amount);

        try {
            payment.processPayment(amount);
            transaction.complete();
        } catch (Exception e) {
            transaction.fail();
        }

        // Выводим статус транзакции
        System.out.println(transaction);

    }
}
