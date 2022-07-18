package exo_interfaces;

public class VisaPayment implements IPaymentMethod {
    @Override
    public void payer() {
        System.out.println("Paiement en cours via Visa");
    }
}
