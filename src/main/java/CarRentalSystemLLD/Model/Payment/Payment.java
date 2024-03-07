package CarRentalSystemLLD.Model.Payment;

public class Payment {
    PaymentDetails paymentDetails ;
    public void payBill(Bill bill, PaymentMode mode) {
        //do payment processing and update the bill status;
        double amount = bill.getTotalBillAmount() ;
        paymentDetails = new PaymentDetails() ;
        paymentDetails.setPaymentMode(mode);
        paymentDetails.setAmountPaid((int)amount);
        bill.setBillPaid(true);
    }

}
