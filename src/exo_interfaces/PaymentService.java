package exo_interfaces;

public class PaymentService {

    private IPaymentMethod paymentMethodGood ;


   public PaymentService(IPaymentMethod paymentMethodGood){
       this.paymentMethodGood = paymentMethodGood ;
   }

   public void payer(){
       paymentMethodGood.payer();
   }



}
