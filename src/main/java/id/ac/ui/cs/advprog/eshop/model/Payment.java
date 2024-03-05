package id.ac.ui.cs.advprog.eshop.model;

import id.ac.ui.cs.advprog.eshop.enums.PaymentMethod;
import id.ac.ui.cs.advprog.eshop.enums.PaymentStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.Map;

@Getter
public class Payment {
    private String paymentId;
    private String method;
    private Map<String, String> paymentData;
    private String status;

    public Payment(String paymentId, String method){
        this.paymentId = paymentId;

        if (PaymentMethod.contains(method)) {
            this.method = method;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public Payment(String paymentId, String method, Map<String,String> paymentData){
        this(paymentId, method);

        if (paymentData.isEmpty()) {
            throw new IllegalArgumentException();
        } else {
            this.paymentData = paymentData;
        }
    }

    public Payment(String paymentId, String method, Map<String,String> paymentData, String status) {
        this(paymentId, method, paymentData);
        this.setStatus(status);
    }

    public void setStatus(String status){

        if (PaymentStatus.contains(status)) {
            this.status = status;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
