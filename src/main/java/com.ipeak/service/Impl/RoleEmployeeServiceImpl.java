package com.ipeak.service.Impl;
import com.ipeak.common.Assist;
import com.ipeak.dao.RoleEmployeeDao;
import com.ipeak.entity.RoleEmployee;
import com.ipeak.service.RoleEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleEmployeeServiceImpl implements RoleEmployeeService {
    @Autowired
    private RoleEmployeeDao roleEmployeeDao;
    @Override
    public long getRoleEmployeeRowCount(Assist assist){
        return roleEmployeeDao.getRoleEmployeeRowCount(assist);
    }
    @Override
    public List<RoleEmployee> selectRoleEmployee(Assist assist){
        return roleEmployeeDao.selectRoleEmployee(assist);
    }
    @Override
    public RoleEmployee selectRoleEmployeeByObj(RoleEmployee obj){
        return roleEmployeeDao.selectRoleEmployeeByObj(obj);
    }
    @Override
    public RoleEmployee selectRoleEmployeeById(Object id){
        return roleEmployeeDao.selectRoleEmployeeById(id);
    }
    @Override
    public int insertRoleEmployee(RoleEmployee value){
        return roleEmployeeDao.insertRoleEmployee(value);
    }
    @Override
    public int insertNonEmptyRoleEmployee(RoleEmployee value){
        return roleEmployeeDao.insertNonEmptyRoleEmployee(value);
    }
    @Override
    public int insertRoleEmployeeByBatch(List<RoleEmployee> value){
        return roleEmployeeDao.insertRoleEmployeeByBatch(value);
    }
    @Override
    public int deleteRoleEmployeeById(Object id){
        return roleEmployeeDao.deleteRoleEmployeeById(id);
    }
    @Override
    public int deleteRoleEmployee(Assist assist){
        return roleEmployeeDao.deleteRoleEmployee(assist);
    }
    @Override
    public int updateRoleEmployeeById(RoleEmployee enti){
        return roleEmployeeDao.updateRoleEmployeeById(enti);
    }
    @Override
    public int updateRoleEmployee(RoleEmployee value, Assist assist){
        return roleEmployeeDao.updateRoleEmployee(value,assist);
    }
    @Override
    public int updateNonEmptyRoleEmployeeById(RoleEmployee enti){
        return roleEmployeeDao.updateNonEmptyRoleEmployeeById(enti);
    }
    @Override
    public int updateNonEmptyRoleEmployee(RoleEmployee value, Assist assist){
        return roleEmployeeDao.updateNonEmptyRoleEmployee(value,assist);
    }

    public RoleEmployeeDao getRoleEmployeeDao() {
        return this.roleEmployeeDao;
    }

    public void setRoleEmployeeDao(RoleEmployeeDao roleEmployeeDao) {
        this.roleEmployeeDao = roleEmployeeDao;
    }

}