package com.ipeak.entity;
public class RoleEmployee {
    private Long roleId;
    private Long empId;
    public RoleEmployee() {
        super();
    }
    public RoleEmployee(Long roleId,Long empId) {
        super();
        this.roleId = roleId;
        this.empId = empId;
    }
    public Long getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getEmpId() {
        return this.empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

}
