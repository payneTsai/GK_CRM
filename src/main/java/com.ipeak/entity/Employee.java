package com.ipeak.entity;
public class Employee {
    private Long empId;//员工id
    private java.util.Date gmtCreate;//员工创建时间
    private String empPassword;//员工密码
    private String empMoblie;//员工手机号码
    private java.util.Date lastLogin;//员工最后一次登录时间
    private String empName;//员工姓名
    private java.util.Date gmtModified;//员工修改时间
    private String empEmail;//员工邮箱
    public Employee() {
        super();
    }
    public Employee(Long empId,java.util.Date gmtCreate,String empPassword,String empMoblie,java.util.Date lastLogin,String empName,java.util.Date gmtModified,String empEmail) {
        super();
        this.empId = empId;
        this.gmtCreate = gmtCreate;
        this.empPassword = empPassword;
        this.empMoblie = empMoblie;
        this.lastLogin = lastLogin;
        this.empName = empName;
        this.gmtModified = gmtModified;
        this.empEmail = empEmail;
    }
    public Long getEmpId() {
        return this.empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public java.util.Date getGmtCreate() {
        return this.gmtCreate;
    }

    public void setGmtCreate(java.util.Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getEmpPassword() {
        return this.empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
    }

    public String getEmpMoblie() {
        return this.empMoblie;
    }

    public void setEmpMoblie(String empMoblie) {
        this.empMoblie = empMoblie;
    }

    public java.util.Date getLastLogin() {
        return this.lastLogin;
    }

    public void setLastLogin(java.util.Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getEmpName() {
        return this.empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public java.util.Date getGmtModified() {
        return this.gmtModified;
    }

    public void setGmtModified(java.util.Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getEmpEmail() {
        return this.empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

}
