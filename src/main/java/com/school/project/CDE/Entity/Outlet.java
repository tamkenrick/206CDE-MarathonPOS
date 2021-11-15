package com.school.project.CDE.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "OUTLET")
@Entity
public class Outlet {
    @Id
    @Column(name = "OUTLET_ID", nullable = false, length = 4)
    private String id;

    @Column(name = "OUTLET_NAME", nullable = false, length = 30)
    private String outletName;

    @Column(name = "OUTLET_ADDRESS", nullable = false, length = 100)
    private String outletAddress;

    public String getOutletAddress() {
        return outletAddress;
    }

    public void setOutletAddress(String outletAddress) {
        this.outletAddress = outletAddress;
    }

    public String getOutletName() {
        return outletName;
    }

    public void setOutletName(String outletName) {
        this.outletName = outletName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}