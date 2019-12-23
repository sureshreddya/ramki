package com.gprs.controller.product;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gprs.entity.product.Product;
import com.gprs.services.product.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService ProductService;
	
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping(value="/productPage")
	public ModelAndView productPage() {
		HttpSession session=request.getSession();
		Collection<Product> products=ProductService.getProductList();
		session.setAttribute("Products",products);
		
		
		return new ModelAndView("Product");
	}
	@RequestMapping("/AddProductPage")
	public ModelAndView getAddProductPage(Model model){
		ModelAndView modelAndView=new ModelAndView();
		
		return modelAndView;
	}
}
