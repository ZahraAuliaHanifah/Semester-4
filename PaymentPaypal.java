public class PaymentPaypal extends Payment {
    private String PaypalToken;
    private String PaypalID;

    PaymentPaypal(String Token, String ID, String costumerID) {
        this.PaypalToken = Token;
        this.PaypalID = ID;
    }

    public void pay(double amount) {
        System.out.println("using paypal API to transfer " + amount + " to the account.");
    }
}
