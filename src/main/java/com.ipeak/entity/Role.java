package com.ipeak.entity;
public class Role {
    private Long roleId;
    private String roleName;
    public Role() {
        super();
    }
    public Role(Long roleId,String roleName) {
        super();
        this.roleId = roleId;
        this.roleName = roleName;
    }
    public Long getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}
