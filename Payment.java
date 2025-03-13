public class Payment {
    private String customerID;
    private String paymentID;
    private String paymentDate;
    private double amount;

    public Payment() {
        this.paymentID = generateID();
        this.paymentDate = generateDate();
    }

    public Payment(String customerID) {
        this.customerID = customerID;
        this.paymentID = generateID();
        this.paymentDate = generateDate();
    }

    public Payment(String customerID, double amount) {
        this.customerID = customerID;
        this.amount = amount;
        this.paymentID = paymentID;
        this.paymentDate = generateDate();
    }

    public String generateID() {
        return "111111";
    }

    public String generateDate() {
        return "2025-03-13";
    }

    public void printPaymentDetails() {
        System.out.println("Payment ID: " + paymentID);
        System.out.println("Payment Date: " + paymentDate);
        System.out.println("Amount: " + amount);
        System.out.println("Customer ID: " + customerID);
    }
}
