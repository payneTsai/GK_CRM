package com.ipeak.dao;
import com.ipeak.common.Assist;
import com.ipeak.entity.BuildingRing;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BuildingRingDao{
	/**
	 * 获得BuildingRing数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getBuildingRingRowCount(Assist assist);
	/**
	 * 获得BuildingRing数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<BuildingRing> selectBuildingRing(Assist assist);
	/**
	 * 获得一个BuildingRing对象,以参数BuildingRing对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    BuildingRing selectBuildingRingByObj(BuildingRing obj);
	/**
	 * 通过BuildingRing的id获得BuildingRing对象
	 * @param id
	 * @return
	 */
    BuildingRing selectBuildingRingById(Long id);
	/**
	 * 插入BuildingRing到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertBuildingRing(BuildingRing value);
	/**
	 * 插入BuildingRing中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyBuildingRing(BuildingRing value);
	/**
	 * 批量插入BuildingRing到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertBuildingRingByBatch(List<BuildingRing> value);
	/**
	 * 通过BuildingRing的id删除BuildingRing
	 * @param id
	 * @return
	 */
    int deleteBuildingRingById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除BuildingRing
	 * @param assist
	 * @return
	 */
    int deleteBuildingRing(Assist assist);
	/**
	 * 通过BuildingRing的id更新BuildingRing中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateBuildingRingById(BuildingRing enti);
 	/**
	 * 通过辅助工具Assist的条件更新BuildingRing中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateBuildingRing(@Param("enti") BuildingRing value, @Param("assist") Assist assist);
	/**
	 * 通过BuildingRing的id更新BuildingRing中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyBuildingRingById(BuildingRing enti);
 	/**
	 * 通过辅助工具Assist的条件更新BuildingRing中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyBuildingRing(@Param("enti") BuildingRing value, @Param("assist") Assist assist);
}