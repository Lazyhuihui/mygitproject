package com.huihui.water.dao;

import java.util.List;

import com.huihui.common.persistence.annotation.MyBatisDao;
import com.huihui.water.entity.Product;
@MyBatisDao
public interface ProductDao {
	public Product selectProductByID(int id);
	public List<Product> selectProducts();
}
