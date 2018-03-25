package com.ingo.portal.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by jbpeng on 18-3-26.
 */

@Entity
public class BasicInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String companyName;
    private String companyOwner;
    private String telephone;
    private String phone;
    private String email;
    private String qq;
    private String weChat;
    private String companyAddress;
    private String factoryAddress;
    @Column(columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Timestamp dataCreateTime;
    @Column(columnDefinition = "timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp dataUpdateTime;

    public BasicInfo() {
    }

    public BasicInfo(String companyName, String companyOwner, String telephone, String phone, String email, String qq, String weChat, String companyAddress, String factoryAddress) {
        this.companyName = companyName;
        this.companyOwner = companyOwner;
        this.telephone = telephone;
        this.phone = phone;
        this.email = email;
        this.qq = qq;
        this.weChat = weChat;
        this.companyAddress = companyAddress;
        this.factoryAddress = factoryAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyOwner() {
        return companyOwner;
    }

    public void setCompanyOwner(String companyOwner) {
        this.companyOwner = companyOwner;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWeChat() {
        return weChat;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getFactoryAddress() {
        return factoryAddress;
    }

    public void setFactoryAddress(String factoryAddress) {
        this.factoryAddress = factoryAddress;
    }

    public Timestamp getDataCreateTime() {
        return dataCreateTime;
    }

    public void setDataCreateTime(Timestamp dataCreateTime) {
        this.dataCreateTime = dataCreateTime;
    }

    public Timestamp getDataUpdateTime() {
        return dataUpdateTime;
    }

    public void setDataUpdateTime(Timestamp dataUpdateTime) {
        this.dataUpdateTime = dataUpdateTime;
    }

    @Override
    public String toString() {
        return "BasicInfo{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", companyOwner='" + companyOwner + '\'' +
                ", telephone='" + telephone + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", qq='" + qq + '\'' +
                ", weChat='" + weChat + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", factoryAddress='" + factoryAddress + '\'' +
                ", dataCreateTime=" + dataCreateTime +
                ", dataUpdateTime=" + dataUpdateTime +
                '}';
    }
}
