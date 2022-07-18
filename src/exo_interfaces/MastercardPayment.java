package exo_interfaces;

public class MastercardPayment implements IPaymentMethod {
    @Override
    public void payer() {
        System.out.println("Paiement en cours via MasterCard");
    }
}
