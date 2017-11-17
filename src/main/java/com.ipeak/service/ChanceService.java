package com.ipeak.service;

import com.ipeak.common.Assist;
import com.ipeak.entity.Chance;

import java.util.List;

public interface ChanceService{
	/**
	 * 获得Chance数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getChanceRowCount(Assist assist);
	/**
	 * 获得Chance数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Chance> selectChance(Assist assist);
	/**
	 * 获得一个Chance对象,以参数Chance对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Chance selectChanceByObj(Chance obj);
	/**
	 * 通过Chance的id获得Chance对象
	 * @param id
	 * @return
	 */
    Chance selectChanceById(Long id);
	/**
	 * 插入Chance到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertChance(Chance value);
	/**
	 * 插入Chance中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyChance(Chance value);
	/**
	 * 批量插入Chance到数据库
	 * @param value
	 * @return
	 */
    int insertChanceByBatch(List<Chance> value);
	/**
	 * 通过Chance的id删除Chance
	 * @param id
	 * @return
	 */
    int deleteChanceById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除Chance
	 * @param assist
	 * @return
	 */
    int deleteChance(Assist assist);
	/**
	 * 通过Chance的id更新Chance中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateChanceById(Chance enti);
 	/**
	 * 通过辅助工具Assist的条件更新Chance中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateChance(Chance value, Assist assist);
	/**
	 * 通过Chance的id更新Chance中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyChanceById(Chance enti);
 	/**
	 * 通过辅助工具Assist的条件更新Chance中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyChance(Chance value, Assist assist);
}