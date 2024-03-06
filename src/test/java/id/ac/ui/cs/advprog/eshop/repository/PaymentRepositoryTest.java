package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.enums.PaymentMethod;
import id.ac.ui.cs.advprog.eshop.model.Payment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentRepositoryTest {

    private Map<String, String> paymentData;
    @BeforeEach
    void setup(){
        this.paymentData = new HashMap<>();
        this.paymentData.put("voucherCode","lol");

    }

    @Test
    void testAddAndFindPaymentById() {
        PaymentRepository paymentRepository = new PaymentRepository();
        Payment payment = new Payment("13672756-727a-4c07-b727-54cb7276d79b",
                PaymentMethod.VOUCHER.getValue(), this.paymentData);
        paymentRepository.add(payment);

    Payment foundPayment = paymentRepository.findById("13672756-727a-4c07-b727-54cb7276d79b");
    assertEquals("13672756-727a-4c07-b727-54cb7276d79b", foundPayment.getPaymentId());
    assertEquals(PaymentMethod.VOUCHER.getValue(), foundPayment.getMethod());
    assertEquals(this.paymentData, foundPayment.getPaymentData());

    }

    @Test
    void testGetAllPayments() {
        PaymentRepository paymentRepository = new PaymentRepository();
        Payment payment1 = new Payment("13672756-727a-4c07-b727-54cb7276d79b",
                PaymentMethod.VOUCHER.getValue(), this.paymentData);
        paymentRepository.add(payment1);
        Payment payment2 = new Payment("13672756-727a-4c07-b727-54cb7276d79b",
                PaymentMethod.VOUCHER.getValue(), this.paymentData);
        paymentRepository.add(payment2);

        List<Payment> paymentArr = paymentRepository.findAll();
        Iterator<Payment> paymentItr = paymentArr.iterator();
        assertEquals(2, paymentArr.size());
        assertEquals(paymentItr.next(), payment1);
        assertEquals(paymentItr.next(), payment2);

    }

}
