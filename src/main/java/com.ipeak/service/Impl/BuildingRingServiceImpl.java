package com.ipeak.service.Impl;

import java.util.List;
import com.ipeak.common.Assist;
import com.ipeak.dao.BuildingRingDao;
import com.ipeak.entity.BuildingRing;
import com.ipeak.service.BuildingRingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuildingRingServiceImpl implements BuildingRingService {

    @Autowired
    private BuildingRingDao buildingRingDao;
    @Override
    public long getBuildingRingRowCount(Assist assist){
        return buildingRingDao.getBuildingRingRowCount(assist);
    }
    @Override
    public List<BuildingRing> selectBuildingRing(Assist assist){
        return buildingRingDao.selectBuildingRing(assist);
    }
    @Override
    public BuildingRing selectBuildingRingByObj(BuildingRing obj){
        return buildingRingDao.selectBuildingRingByObj(obj);
    }
    @Override
    public BuildingRing selectBuildingRingById(Long id){
        return buildingRingDao.selectBuildingRingById(id);
    }
    @Override
    public int insertBuildingRing(BuildingRing value){
        return buildingRingDao.insertBuildingRing(value);
    }
    @Override
    public int insertNonEmptyBuildingRing(BuildingRing value){
        return buildingRingDao.insertNonEmptyBuildingRing(value);
    }
    @Override
    public int insertBuildingRingByBatch(List<BuildingRing> value){
        return buildingRingDao.insertBuildingRingByBatch(value);
    }
    @Override
    public int deleteBuildingRingById(Long id){
        return buildingRingDao.deleteBuildingRingById(id);
    }
    @Override
    public int deleteBuildingRing(Assist assist){
        return buildingRingDao.deleteBuildingRing(assist);
    }
    @Override
    public int updateBuildingRingById(BuildingRing enti){
        return buildingRingDao.updateBuildingRingById(enti);
    }
    @Override
    public int updateBuildingRing(BuildingRing value, Assist assist){
        return buildingRingDao.updateBuildingRing(value,assist);
    }
    @Override
    public int updateNonEmptyBuildingRingById(BuildingRing enti){
        return buildingRingDao.updateNonEmptyBuildingRingById(enti);
    }
    @Override
    public int updateNonEmptyBuildingRing(BuildingRing value, Assist assist){
        return buildingRingDao.updateNonEmptyBuildingRing(value,assist);
    }

    public BuildingRingDao getBuildingRingDao() {
        return this.buildingRingDao;
    }

    public void setBuildingRingDao(BuildingRingDao buildingRingDao) {
        this.buildingRingDao = buildingRingDao;
    }

}