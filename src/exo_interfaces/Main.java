package exo_interfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Mauvaise façon de fonctionner
        MastercardPayment mcPayment = new MastercardPayment();
        PaypalPayment ppPayment = new PaypalPayment();
        VisaPayment vPayment = new VisaPayment();


        var input = new Scanner(System.in);
        System.out.println("Choisissez votre mode de paiement :" +
                "Entrez 1 pour VISA , 2 pour MASTERCARD ou 3 pour PAYPAL");
        int choix =input.nextInt();
        if (choix == 1) {
            PaymentService payment = new PaymentService(vPayment);
            payment.payer();
        }else if(choix == 2 ) {
            PaymentService payment = new PaymentService(mcPayment);
            payment.payer();
        }else if(choix == 3) {
            PaymentService payment = new PaymentService(ppPayment);
            payment.payer();
        } else{
            System.out.println("Erreur veuillez recommencer votre saisie");
        }



    }
}
