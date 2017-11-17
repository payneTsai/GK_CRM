package com.ipeak.service.Impl;
import com.ipeak.common.Assist;
import com.ipeak.dao.CustomerDao;
import com.ipeak.entity.Customer;
import com.ipeak.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;
    @Override
    public long getCustomerRowCount(Assist assist){
        return customerDao.getCustomerRowCount(assist);
    }
    @Override
    public List<Customer> selectCustomer(Assist assist){
        return customerDao.selectCustomer(assist);
    }
    @Override
    public Customer selectCustomerByObj(Customer obj){
        return customerDao.selectCustomerByObj(obj);
    }
    @Override
    public Customer selectCustomerById(Long id){
        return customerDao.selectCustomerById(id);
    }
    @Override
    public int insertCustomer(Customer value){
        return customerDao.insertCustomer(value);
    }
    @Override
    public int insertNonEmptyCustomer(Customer value){
        return customerDao.insertNonEmptyCustomer(value);
    }
    @Override
    public int insertCustomerByBatch(List<Customer> value){
        return customerDao.insertCustomerByBatch(value);
    }
    @Override
    public int deleteCustomerById(Long id){
        return customerDao.deleteCustomerById(id);
    }
    @Override
    public int deleteCustomer(Assist assist){
        return customerDao.deleteCustomer(assist);
    }
    @Override
    public int updateCustomerById(Customer enti){
        return customerDao.updateCustomerById(enti);
    }
    @Override
    public int updateCustomer(Customer value, Assist assist){
        return customerDao.updateCustomer(value,assist);
    }
    @Override
    public int updateNonEmptyCustomerById(Customer enti){
        return customerDao.updateNonEmptyCustomerById(enti);
    }
    @Override
    public int updateNonEmptyCustomer(Customer value, Assist assist){
        return customerDao.updateNonEmptyCustomer(value,assist);
    }

    public CustomerDao getCustomerDao() {
        return this.customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

}