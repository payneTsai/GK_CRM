package com.ipeak.entity;
public class Customer {
    private Long customerId;//客户id
    private java.util.Date gmtCreate;//客户创建时间
    private String customerMobile;//客户手机号码
    private String customerName;//客户名称
    private java.util.Date gmtModified;//客户修改时间
    public Customer() {
        super();
    }
    public Customer(Long customerId,java.util.Date gmtCreate,String customerMobile,String customerName,java.util.Date gmtModified) {
        super();
        this.customerId = customerId;
        this.gmtCreate = gmtCreate;
        this.customerMobile = customerMobile;
        this.customerName = customerName;
        this.gmtModified = gmtModified;
    }
    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public java.util.Date getGmtCreate() {
        return this.gmtCreate;
    }

    public void setGmtCreate(java.util.Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getCustomerMobile() {
        return this.customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public java.util.Date getGmtModified() {
        return this.gmtModified;
    }

    public void setGmtModified(java.util.Date gmtModified) {
        this.gmtModified = gmtModified;
    }

}
