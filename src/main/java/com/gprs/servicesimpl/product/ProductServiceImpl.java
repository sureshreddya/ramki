package com.gprs.servicesimpl.product;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.gprs.entity.product.Product;
import com.gprs.exception.PersistentException;
import com.gprs.services.product.ProductService;
@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public Product saveProduct(Product product) throws PersistentException{
		return null;
	}

	@Override
	public Collection<Product> getProductList() {
		return null;
	}

	@Override
	public Product getProduct(Product product) {
		return null;
	}

}
