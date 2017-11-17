package com.ipeak.service.Impl;
import com.ipeak.common.Assist;
import com.ipeak.dao.ChanceDao;
import com.ipeak.entity.Chance;
import com.ipeak.service.ChanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChanceServiceImpl implements ChanceService {
    @Autowired
    private ChanceDao chanceDao;
    @Override
    public long getChanceRowCount(Assist assist){
        return chanceDao.getChanceRowCount(assist);
    }
    @Override
    public List<Chance> selectChance(Assist assist){
        return chanceDao.selectChance(assist);
    }
    @Override
    public Chance selectChanceByObj(Chance obj){
        return chanceDao.selectChanceByObj(obj);
    }
    @Override
    public Chance selectChanceById(Long id){
        return chanceDao.selectChanceById(id);
    }
    @Override
    public int insertChance(Chance value){
        return chanceDao.insertChance(value);
    }
    @Override
    public int insertNonEmptyChance(Chance value){
        return chanceDao.insertNonEmptyChance(value);
    }
    @Override
    public int insertChanceByBatch(List<Chance> value){
        return chanceDao.insertChanceByBatch(value);
    }
    @Override
    public int deleteChanceById(Long id){
        return chanceDao.deleteChanceById(id);
    }
    @Override
    public int deleteChance(Assist assist){
        return chanceDao.deleteChance(assist);
    }
    @Override
    public int updateChanceById(Chance enti){
        return chanceDao.updateChanceById(enti);
    }
    @Override
    public int updateChance(Chance value, Assist assist){
        return chanceDao.updateChance(value,assist);
    }
    @Override
    public int updateNonEmptyChanceById(Chance enti){
        return chanceDao.updateNonEmptyChanceById(enti);
    }
    @Override
    public int updateNonEmptyChance(Chance value, Assist assist){
        return chanceDao.updateNonEmptyChance(value,assist);
    }

    public ChanceDao getChanceDao() {
        return this.chanceDao;
    }

    public void setChanceDao(ChanceDao chanceDao) {
        this.chanceDao = chanceDao;
    }

}