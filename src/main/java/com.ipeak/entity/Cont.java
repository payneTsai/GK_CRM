package com.ipeak.entity;
public class Cont {
    private Long contId;//合同id
    private java.util.Date gmtCreate;//合同创建时间
    private String contStatus;
    private String theme;//合同主题
    private Long customerId;//客户id
    private Double transactionMoney;//销售金额
    private java.util.Date gmtModified;//合同修改时间
    private Long empId;//员工id
    private String contName;//合同名称
    public Cont() {
        super();
    }
    public Cont(Long contId,java.util.Date gmtCreate,String contStatus,String theme,Long customerId,Double transactionMoney,java.util.Date gmtModified,Long empId,String contName) {
        super();
        this.contId = contId;
        this.gmtCreate = gmtCreate;
        this.contStatus = contStatus;
        this.theme = theme;
        this.customerId = customerId;
        this.transactionMoney = transactionMoney;
        this.gmtModified = gmtModified;
        this.empId = empId;
        this.contName = contName;
    }
    public Long getContId() {
        return this.contId;
    }

    public void setContId(Long contId) {
        this.contId = contId;
    }

    public java.util.Date getGmtCreate() {
        return this.gmtCreate;
    }

    public void setGmtCreate(java.util.Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getContStatus() {
        return this.contStatus;
    }

    public void setContStatus(String contStatus) {
        this.contStatus = contStatus;
    }

    public String getTheme() {
        return this.theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Double getTransactionMoney() {
        return this.transactionMoney;
    }

    public void setTransactionMoney(Double transactionMoney) {
        this.transactionMoney = transactionMoney;
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

    public String getContName() {
        return this.contName;
    }

    public void setContName(String contName) {
        this.contName = contName;
    }

}
