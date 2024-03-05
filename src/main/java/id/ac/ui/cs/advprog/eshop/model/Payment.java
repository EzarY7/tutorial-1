package id.ac.ui.cs.advprog.eshop.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
public class Payment {
    private String paymentId;
    private String method;
    private Map<String, String> paymentData;
    @Setter
    private String status;
    public Payment(String paymentId, String method, Map<String,String> paymentData){}

    public Payment(String paymentId, String method, Map<String,String> paymentData, String status) {}
}
