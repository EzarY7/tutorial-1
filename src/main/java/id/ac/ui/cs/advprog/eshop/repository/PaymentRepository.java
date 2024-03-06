package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Payment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PaymentRepository {
    List<Payment> payments = new ArrayList<>();

    public Payment add(Payment payment){
        payments.add(payment);
        return payment;
    }

    public Payment findById(String id){
        for (Payment payment : payments) {
            if (payment.getPaymentId().equals(id)) {
                return payment;
            }
        }
        return null;
    }

    public List<Payment> findAll(){
        return payments;
    }

}
