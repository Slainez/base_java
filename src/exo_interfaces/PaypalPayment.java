package exo_interfaces;

public class PaypalPayment implements IPaymentMethod{
    @Override
    public void payer() {
        System.out.println("Paiement en cours via Paypal");
    }
}
