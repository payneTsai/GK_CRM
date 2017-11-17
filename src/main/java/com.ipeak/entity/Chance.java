package com.ipeak.entity;
public class Chance {
    private Long chanceId;//销售机会id
    private java.util.Date gmtCreate;//销售机会id
    private String chanceName;//销售机会名称
    private String chanceStatus;//销售机会状态
    private Long productId;//产品id
    private Long customerId;//客户id
    private java.util.Date gmtModified;//销售机会修改时间
    private Long empId;//员工id
    public Chance() {
        super();
    }
    public Chance(Long chanceId,java.util.Date gmtCreate,String chanceName,String chanceStatus,Long productId,Long customerId,java.util.Date gmtModified,Long empId) {
        super();
        this.chanceId = chanceId;
        this.gmtCreate = gmtCreate;
        this.chanceName = chanceName;
        this.chanceStatus = chanceStatus;
        this.productId = productId;
        this.customerId = customerId;
        this.gmtModified = gmtModified;
        this.empId = empId;
    }
    public Long getChanceId() {
        return this.chanceId;
    }

    public void setChanceId(Long chanceId) {
        this.chanceId = chanceId;
    }

    public java.util.Date getGmtCreate() {
        return this.gmtCreate;
    }

    public void setGmtCreate(java.util.Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getChanceName() {
        return this.chanceName;
    }

    public void setChanceName(String chanceName) {
        this.chanceName = chanceName;
    }

    public String getChanceStatus() {
        return this.chanceStatus;
    }

    public void setChanceStatus(String chanceStatus) {
        this.chanceStatus = chanceStatus;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public java.util.Date getGmtModified() {
        return this.gmtModified;
    }

    public void setGmtModified(java.util.Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Long getEmpId() {
        return this.empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

}
