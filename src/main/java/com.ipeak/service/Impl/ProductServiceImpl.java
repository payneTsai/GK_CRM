package com.ipeak.service.Impl;
import com.ipeak.common.Assist;
import com.ipeak.dao.ProductDao;
import com.ipeak.entity.Product;
import com.ipeak.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Override
    public long getProductRowCount(Assist assist){
        return productDao.getProductRowCount(assist);
    }
    @Override
    public List<Product> selectProduct(Assist assist){
        return productDao.selectProduct(assist);
    }
    @Override
    public Product selectProductByObj(Product obj){
        return productDao.selectProductByObj(obj);
    }
    @Override
    public Product selectProductById(Long id){
        return productDao.selectProductById(id);
    }
    @Override
    public int insertProduct(Product value){
        return productDao.insertProduct(value);
    }
    @Override
    public int insertNonEmptyProduct(Product value){
        return productDao.insertNonEmptyProduct(value);
    }
    @Override
    public int insertProductByBatch(List<Product> value){
        return productDao.insertProductByBatch(value);
    }
    @Override
    public int deleteProductById(Long id){
        return productDao.deleteProductById(id);
    }
    @Override
    public int deleteProduct(Assist assist){
        return productDao.deleteProduct(assist);
    }
    @Override
    public int updateProductById(Product enti){
        return productDao.updateProductById(enti);
    }
    @Override
    public int updateProduct(Product value, Assist assist){
        return productDao.updateProduct(value,assist);
    }
    @Override
    public int updateNonEmptyProductById(Product enti){
        return productDao.updateNonEmptyProductById(enti);
    }
    @Override
    public int updateNonEmptyProduct(Product value, Assist assist){
        return productDao.updateNonEmptyProduct(value,assist);
    }

    public ProductDao getProductDao() {
        return this.productDao;
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

}