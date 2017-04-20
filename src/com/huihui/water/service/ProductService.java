package com.huihui.water.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huihui.water.dao.ProductDao;
import com.huihui.water.entity.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;
	public List<Product> getAllproduct(){
		return productDao.selectProducts();
	}
	public Product getProductByID(int id){
		return productDao.selectProductByID(id);
	}
	
}
