public class PaymentXendit {
    private String PaymentMethod;
    private String SecretToken;
    private String projectID;

    public PaymentXendit(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    public void pay(double amount) {
        if (this.PaymentMethod == "transfer") {
            this.bankTransfer();
        }
        else if (this.PaymentMethod == "VA") {
            this.virtualAccount();
        }
    }

    private void bankTransfer() {
        System.out.println("Sending money by transfer");
    }

    private void virtualAccount() {
        System.out.println("Sending money by VA");
    }
}
