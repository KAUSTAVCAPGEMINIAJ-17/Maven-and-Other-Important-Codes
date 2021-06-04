package com.capgemini.HashcodeandequalsMethod.Vegetable.service;

import java.util.Comparator;

import com.capgemini.HashcodeandequalsMethod.Vegetable.model.Vegetable;

public class VegetablePriceComparator implements Comparator<Vegetable> {

	@Override
	public int compare(Vegetable vegetable1, Vegetable vegetable2) {
		// TODO Auto-generated method stub
		if(vegetable1.getVegprice()==vegetable2.getVegprice()) 
		    return 0;
				else if(vegetable1.getVegprice()>vegetable2.getVegprice()) 
					return 1;
				else 
					return -1;
	}

}