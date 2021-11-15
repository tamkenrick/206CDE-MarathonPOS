package com.school.project.CDE.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "PROMOTION")
@Entity
public class Promotion {
    @Id
    @Column(name = "PROMOTION", nullable = false, length = 20)
    private String id;

    @Column(name = "PROMOTION_CODE", nullable = false, length = 15)
    private String promotionCode;

    @Column(name = "PROMO_DESCRIPTION", length = 300)
    private String promoDescription;

    @Column(name = "PROMO_STATUS")
    private Boolean promoStatus;

    public Boolean getPromoStatus() {
        return promoStatus;
    }

    public void setPromoStatus(Boolean promoStatus) {
        this.promoStatus = promoStatus;
    }

    public String getPromoDescription() {
        return promoDescription;
    }

    public void setPromoDescription(String promoDescription) {
        this.promoDescription = promoDescription;
    }

    public String getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}