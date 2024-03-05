package id.ac.ui.cs.advprog.eshop.model;
import id.ac.ui.cs.advprog.eshop.enums.PaymentMethod;
import id.ac.ui.cs.advprog.eshop.enums.PaymentStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.InvalidArgumentException;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
public class PaymentTest {
    private Map<String, String> paymentData;

    @BeforeEach
    void setUp(){
        this.paymentData = new HashMap<>();
        this.paymentData.put("voucherCode","lol");
    }

    @Test
    void testCreateSuccessStatus() {
        Payment payment = new Payment("13672756-727a-4c07-b727-54cb7276d79b",
                PaymentMethod.VOUCHER.getValue(), this.paymentData, PaymentStatus.SUCCESS.getValue());

        assertEquals(PaymentStatus.SUCCESS.getValue(), payment.getStatus());
    }

    @Test
    void testCreateInvalidMethod() {
        assertThrows(IllegalArgumentException.class, () -> {
            Payment payment = new Payment("13672756-727a-4c07-b727-54cb7276d79b",
                    "WYSI", this.paymentData );
        });
    }

    @Test
    void testSetStatusToSuccess() {
        Payment payment = new Payment("13672756-727a-4c07-b727-54cb7276d79b",
                PaymentMethod.VOUCHER.getValue(), this.paymentData);

        payment.setStatus(PaymentStatus.SUCCESS.getValue());
        assertEquals(PaymentStatus.SUCCESS.getValue(), payment.getStatus());
    }

    @Test
    void testCreateIfEmptyPaymentData() {
        this.paymentData.clear();

        assertThrows(IllegalArgumentException.class, () -> {
            Payment payment = new Payment("13672756-727a-4c07-b727-54cb7276d79b",
                    PaymentMethod.VOUCHER.getValue(), this.paymentData);
        });
    }

    @Test
    void testSetInvalidStatus() {
        assertThrows(IllegalArgumentException.class, () -> {
            Payment payment = new Payment("13672756-727a-4c07-b727-54cb7276d79b",
                    PaymentMethod.VOUCHER.getValue(), this.paymentData, "727WYFSI");
        });
    }

}
