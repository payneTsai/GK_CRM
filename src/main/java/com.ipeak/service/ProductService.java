package com.ipeak.service;

import com.ipeak.common.Assist;
import com.ipeak.entity.Product;

import java.util.List;

public interface ProductService{
	/**
	 * 获得Product数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getProductRowCount(Assist assist);
	/**
	 * 获得Product数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Product> selectProduct(Assist assist);
	/**
	 * 获得一个Product对象,以参数Product对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Product selectProductByObj(Product obj);
	/**
	 * 通过Product的id获得Product对象
	 * @param id
	 * @return
	 */
    Product selectProductById(Long id);
	/**
	 * 插入Product到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertProduct(Product value);
	/**
	 * 插入Product中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyProduct(Product value);
	/**
	 * 批量插入Product到数据库
	 * @param value
	 * @return
	 */
    int insertProductByBatch(List<Product> value);
	/**
	 * 通过Product的id删除Product
	 * @param id
	 * @return
	 */
    int deleteProductById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除Product
	 * @param assist
	 * @return
	 */
    int deleteProduct(Assist assist);
	/**
	 * 通过Product的id更新Product中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateProductById(Product enti);
 	/**
	 * 通过辅助工具Assist的条件更新Product中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateProduct(Product value, Assist assist);
	/**
	 * 通过Product的id更新Product中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyProductById(Product enti);
 	/**
	 * 通过辅助工具Assist的条件更新Product中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyProduct(Product value, Assist assist);
}