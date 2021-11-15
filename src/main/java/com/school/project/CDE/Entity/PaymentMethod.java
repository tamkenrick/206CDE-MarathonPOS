package com.school.project.CDE.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "PAYMENT_METHOD")
@Entity
public class PaymentMethod {
    @Id
    @Column(name = "PAYMENT_ID", nullable = false, length = 10)
    private String id;

    @Column(name = "PAYMENT_NAME", nullable = false, length = 10)
    private String paymentName;

    @Column(name = "PAYMENT_DESCRIPTION", length = 100)
    private String paymentDescription;

    @Column(name = "PAYMENT_STATUS")
    private Boolean paymentStatus;

    public Boolean getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentDescription() {
        return paymentDescription;
    }

    public void setPaymentDescription(String paymentDescription) {
        this.paymentDescription = paymentDescription;
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}