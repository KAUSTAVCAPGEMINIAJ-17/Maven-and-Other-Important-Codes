package com.capgemini.HashcodeandequalsMethod.service;
import java.util.Comparator;
import com.capgemini.HashcodeandequalsMethod.model.Product;
public class ProductPriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		if(p1.getPrice()==p2.getPrice())
			return 0;
		if(p1.getPrice()>p2.getPrice()) 
			return 1;
		return -1;
	}

}