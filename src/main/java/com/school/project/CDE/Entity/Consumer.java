package com.school.project.CDE.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "CONSUMER")
@Entity
public class Consumer {
    @Id
    @Column(name = "CONSUMER_ID", nullable = false, length = 10)
    private String id;

    @Column(name = "CONSUMER_NAME", nullable = false, length = 30)
    private String consumerName;

    @Column(name = "CONSUMER_SEX")
    private Boolean consumerSex;

    @Column(name = "CONSUMER_ADDRESS", nullable = false, length = 100)
    private String consumerAddress;

    @Column(name = "CONSUMER_PHONE", nullable = false)
    private Integer consumerPhone;

    @Column(name = "MSG_TYPE", length = 8)
    private String msgType;

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public Integer getConsumerPhone() {
        return consumerPhone;
    }

    public void setConsumerPhone(Integer consumerPhone) {
        this.consumerPhone = consumerPhone;
    }

    public String getConsumerAddress() {
        return consumerAddress;
    }

    public void setConsumerAddress(String consumerAddress) {
        this.consumerAddress = consumerAddress;
    }

    public Boolean getConsumerSex() {
        return consumerSex;
    }

    public void setConsumerSex(Boolean consumerSex) {
        this.consumerSex = consumerSex;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}