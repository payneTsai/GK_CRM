package com.ipeak.service;

import com.ipeak.common.Assist;
import com.ipeak.entity.Cont;

import java.util.List;

public interface ContService{
	/**
	 * 获得Cont数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getContRowCount(Assist assist);
	/**
	 * 获得Cont数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Cont> selectCont(Assist assist);
	/**
	 * 获得一个Cont对象,以参数Cont对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Cont selectContByObj(Cont obj);
	/**
	 * 通过Cont的id获得Cont对象
	 * @param id
	 * @return
	 */
    Cont selectContById(Long id);
	/**
	 * 插入Cont到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertCont(Cont value);
	/**
	 * 插入Cont中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyCont(Cont value);
	/**
	 * 批量插入Cont到数据库
	 * @param value
	 * @return
	 */
    int insertContByBatch(List<Cont> value);
	/**
	 * 通过Cont的id删除Cont
	 * @param id
	 * @return
	 */
    int deleteContById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除Cont
	 * @param assist
	 * @return
	 */
    int deleteCont(Assist assist);
	/**
	 * 通过Cont的id更新Cont中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateContById(Cont enti);
 	/**
	 * 通过辅助工具Assist的条件更新Cont中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateCont(Cont value, Assist assist);
	/**
	 * 通过Cont的id更新Cont中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyContById(Cont enti);
 	/**
	 * 通过辅助工具Assist的条件更新Cont中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyCont(Cont value, Assist assist);
}