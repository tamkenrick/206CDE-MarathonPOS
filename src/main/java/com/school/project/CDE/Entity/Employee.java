package com.school.project.CDE.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "EMPLOYEE")
@Entity
public class Employee {
    @Id
    @Column(name = "EMPLOYEE_ID", nullable = false, length = 8)
    private String id;

    @Column(name = "EMPLOYEE_POST", length = 7)
    private String employeePost;

    @Column(name = "EMPLOYEE_NAME", nullable = false, length = 30)
    private String employeeName;

    @Column(name = "EMPLOYEE_SEX")
    private Boolean employeeSex;

    @Column(name = "EMPLYEE_ADDRESS", nullable = false, length = 100)
    private String emplyeeAddress;

    @Column(name = "EMPLOYEE_PHONE", nullable = false)
    private Integer employeePhone;

    public Integer getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(Integer employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmplyeeAddress() {
        return emplyeeAddress;
    }

    public void setEmplyeeAddress(String emplyeeAddress) {
        this.emplyeeAddress = emplyeeAddress;
    }

    public Boolean getEmployeeSex() {
        return employeeSex;
    }

    public void setEmployeeSex(Boolean employeeSex) {
        this.employeeSex = employeeSex;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeePost() {
        return employeePost;
    }

    public void setEmployeePost(String employeePost) {
        this.employeePost = employeePost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}