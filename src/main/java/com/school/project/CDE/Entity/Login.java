package com.school.project.CDE.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "LOGIN")
@Entity
public class Login {
    @Id
    @Column(name = "USERID", nullable = false, length = 8)
    private String id;

    @Column(name = "LOGIN_PASSWORD", nullable = false, length = 30)
    private String loginPassword;

    @Column(name = "POST", length = 7)
    private String post;

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}