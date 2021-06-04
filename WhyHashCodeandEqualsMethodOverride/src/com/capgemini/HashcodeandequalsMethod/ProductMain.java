package com.capgemini.HashcodeandequalsMethod;

import java.util.ArrayList;
import java.util.Collections;

import com.capgemini.HashcodeandequalsMethod.service.ProductManager;
public class ProductMain {
	public static void main(String[] args) {
	
	ProductManager pm=new ProductManager();
	pm.createProduct();
	pm.compareProduct();
	pm.sortProducts();
	pm.sortProductUsingName();
	
	pm.sortProductUsingProductID();

	}
	/*ArrayList<String> names=new ArrayList<String>();
	names.add("rama11");
	names.add("krishna");
	*/
	
}