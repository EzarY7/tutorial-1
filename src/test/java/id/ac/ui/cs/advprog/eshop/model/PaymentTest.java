package id.ac.ui.cs.advprog.eshop.model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.InvalidArgumentException;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
public class PaymentTest {
    private Map<String, String> paymentData;

    @BeforeEach
    void setUp(){
    }

    @Test
    void testCreateSuccessStatus() {
        Payment payment = new Payment("13672756-727a-4c07-b727-54cb7276d79b","WYSI",
                this.paymentData, "SUCCESS");
        assertEquals("SUCCESS", payment.getStatus());
    }

    @Test
    void testCreateInvalidMethod() {
        assertThrows(InvalidArgumentException.class, () -> {
            Payment payment = new Payment("13672756-727a-4c07-b727-54cb7276d79b",
                    "WYSI", this.paymentData );
        });
    }

    @Test
    void testSetStatusToSuccess() {
        Payment payment = new Payment("13672756-727a-4c07-b727-54cb7276d79b",
                "voucherCode", this.paymentData);
        payment.setStatus("SUCCESS");
        assertEquals("SUCCESS", payment.getStatus());
    }

    @Test
    void testCreateIfEmptyPaymentData() {
        this.paymentData.clear();

        assertThrows(IllegalArgumentException.class, () -> {
            Payment payment = new Payment("13672756-727a-4c07-b727-54cb7276d79b",
                    "voucherCode", this.paymentData);
        });
    }

}
