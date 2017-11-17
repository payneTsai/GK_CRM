package com.ipeak.service;

import com.ipeak.common.Assist;
import com.ipeak.entity.RoleEmployee;

import java.util.List;

public interface RoleEmployeeService{
	/**
	 * 获得RoleEmployee数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getRoleEmployeeRowCount(Assist assist);
	/**
	 * 获得RoleEmployee数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<RoleEmployee> selectRoleEmployee(Assist assist);
	/**
	 * 获得一个RoleEmployee对象,以参数RoleEmployee对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    RoleEmployee selectRoleEmployeeByObj(RoleEmployee obj);
	/**
	 * 通过RoleEmployee的id获得RoleEmployee对象
	 * @param id
	 * @return
	 */
    RoleEmployee selectRoleEmployeeById(Object id);
	/**
	 * 插入RoleEmployee到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertRoleEmployee(RoleEmployee value);
	/**
	 * 插入RoleEmployee中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyRoleEmployee(RoleEmployee value);
	/**
	 * 批量插入RoleEmployee到数据库
	 * @param value
	 * @return
	 */
    int insertRoleEmployeeByBatch(List<RoleEmployee> value);
	/**
	 * 通过RoleEmployee的id删除RoleEmployee
	 * @param id
	 * @return
	 */
    int deleteRoleEmployeeById(Object id);
	/**
	 * 通过辅助工具Assist的条件删除RoleEmployee
	 * @param assist
	 * @return
	 */
    int deleteRoleEmployee(Assist assist);
	/**
	 * 通过RoleEmployee的id更新RoleEmployee中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateRoleEmployeeById(RoleEmployee enti);
 	/**
	 * 通过辅助工具Assist的条件更新RoleEmployee中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateRoleEmployee(RoleEmployee value, Assist assist);
	/**
	 * 通过RoleEmployee的id更新RoleEmployee中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyRoleEmployeeById(RoleEmployee enti);
 	/**
	 * 通过辅助工具Assist的条件更新RoleEmployee中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyRoleEmployee(RoleEmployee value, Assist assist);
}