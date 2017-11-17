package com.ipeak.service.Impl;
import com.ipeak.common.Assist;
import com.ipeak.dao.ContDao;
import com.ipeak.entity.Cont;
import com.ipeak.service.ContService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContServiceImpl implements ContService {
    @Autowired
    private ContDao contDao;
    @Override
    public long getContRowCount(Assist assist){
        return contDao.getContRowCount(assist);
    }
    @Override
    public List<Cont> selectCont(Assist assist){
        return contDao.selectCont(assist);
    }
    @Override
    public Cont selectContByObj(Cont obj){
        return contDao.selectContByObj(obj);
    }
    @Override
    public Cont selectContById(Long id){
        return contDao.selectContById(id);
    }
    @Override
    public int insertCont(Cont value){
        return contDao.insertCont(value);
    }
    @Override
    public int insertNonEmptyCont(Cont value){
        return contDao.insertNonEmptyCont(value);
    }
    @Override
    public int insertContByBatch(List<Cont> value){
        return contDao.insertContByBatch(value);
    }
    @Override
    public int deleteContById(Long id){
        return contDao.deleteContById(id);
    }
    @Override
    public int deleteCont(Assist assist){
        return contDao.deleteCont(assist);
    }
    @Override
    public int updateContById(Cont enti){
        return contDao.updateContById(enti);
    }
    @Override
    public int updateCont(Cont value, Assist assist){
        return contDao.updateCont(value,assist);
    }
    @Override
    public int updateNonEmptyContById(Cont enti){
        return contDao.updateNonEmptyContById(enti);
    }
    @Override
    public int updateNonEmptyCont(Cont value, Assist assist){
        return contDao.updateNonEmptyCont(value,assist);
    }

    public ContDao getContDao() {
        return this.contDao;
    }

    public void setContDao(ContDao contDao) {
        this.contDao = contDao;
    }

}