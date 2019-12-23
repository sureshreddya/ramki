package com.gprs.dao.product;

import java.util.Collection;

import com.gprs.entity.product.Product;
import com.gprs.exception.PersistentException;

public interface ProductDAO {

	Product saveProduct(Product product)throws PersistentException;

	Collection<Product> getProductList();

	Product getProduct(Product product);
}
