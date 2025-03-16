package Online_Payment_Gateway;

public class Transaction {
    private String paymentType;
    private double amount;
    private String status;

    public Transaction(String paymentType, double amount) {
        this.paymentType = paymentType;
        this.amount = amount;
        this.status = "Pending";
    }

    public void complete() {
        this.status = "Completed";
    }

    public void fail() {
        this.status = "Failed";
    }

    @Override
    public String toString() {
        return "Payment Type: " + paymentType + ", Amount: $" + amount + ", Status: " + status;
    }
}
