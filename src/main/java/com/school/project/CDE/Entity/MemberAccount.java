package com.school.project.CDE.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Table(name = "MEMBER_ACCOUNT")
@Entity
public class MemberAccount {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "EMAIL", length = 40)
    private String email;

    @Column(name = "PASSWORD", length = 45)
    private String password;

    @Column(name = "ADDRESS", length = 45)
    private String address;

    @Column(name = "CELLPHONE", length = 45)
    private String cellphone;

    @Column(name = "CREATE_DATE")
    private Instant createDate;

    public Instant getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Instant createDate) {
        this.createDate = createDate;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}