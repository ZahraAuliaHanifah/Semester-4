// Kelas PaymentBankTransfer mewarisi dari Payment
public class PaymentBankTransfer extends Payment {
    private String bankName;
    private String accountNumber;

    public PaymentBankTransfer(String customerID, String bankName, String accountNumber) {
        super(customerID); //Memanggil konstruktor superclass
        this.bankName = bankName;
        this.accountNumber = accountNumber;
    }

    // Implementasi metode untuk melakukan pembayaran
    public void pay(double amount) {
        System.out.println("Transferring " + amount + " to bank account " + accountNumber + " at " + bankName);
    }

    // Metode tambahan untuk mencetak detail pembayaran
    public void printBankDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
    }
}