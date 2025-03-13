public class PaymentCash extends Payment {
    private String adminID;
    private String branchID;

    public PaymentCash(String adminID, String branchID, String customerID) {
        super(customerID);
        this.adminID = adminID;
        this.branchID = branchID;
    }

    public void pay(double amount) {
        System.out.println("Customer come to the branch and pay " + amount + " cash.");
    }
}
