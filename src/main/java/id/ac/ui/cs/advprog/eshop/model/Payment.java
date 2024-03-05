package id.ac.ui.cs.advprog.eshop.model;

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
    public Payment(String paymentId, String method, Map<String,String> paymentData){
        this.paymentId = paymentId;


        if (paymentData.isEmpty()) {
            throw new IllegalArgumentException();
        } else {
            this.paymentData = paymentData;
        }

        String[] methodList = {"voucherCode", "bankTransfer"};
        if(Arrays.stream(methodList).noneMatch(item -> item.equals(method))) {
            throw new IllegalArgumentException();
        } else {
            this.method = method;
        }


    }
    public Payment(String paymentId, String method, Map<String,String> paymentData, String status) {
        this(paymentId, method, paymentData);
        this.setStatus(status);
    }

    public void setStatus(String status){
        String[] statusList = {"SUCCESS", "REJECTED"};
        if(Arrays.stream(statusList).noneMatch(item -> item.equals(status))) {
            throw new IllegalArgumentException();
        } else {
            this.status = status;
        }
    }
}
