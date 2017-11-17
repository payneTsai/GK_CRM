package com.ipeak.entity;
public class Product {
    private Long productId;
    private java.util.Date gmtCreate;
    private String productType;
    private String productDescribe;
    private java.util.Date gmtModified;
    private String productName;
    public Product() {
        super();
    }
    public Product(Long productId,java.util.Date gmtCreate,String productType,String productDescribe,java.util.Date gmtModified,String productName) {
        super();
        this.productId = productId;
        this.gmtCreate = gmtCreate;
        this.productType = productType;
        this.productDescribe = productDescribe;
        this.gmtModified = gmtModified;
        this.productName = productName;
    }
    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public java.util.Date getGmtCreate() {
        return this.gmtCreate;
    }

    public void setGmtCreate(java.util.Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getProductType() {
        return this.productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductDescribe() {
        return this.productDescribe;
    }

    public void setProductDescribe(String productDescribe) {
        this.productDescribe = productDescribe;
    }

    public java.util.Date getGmtModified() {
        return this.gmtModified;
    }

    public void setGmtModified(java.util.Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

}
