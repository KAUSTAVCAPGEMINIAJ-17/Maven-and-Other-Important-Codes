package com.capgemini.HashcodeandequalsMethod.Vegetable.service;

import java.util.Comparator;

import com.capgemini.HashcodeandequalsMethod.Vegetable.model.Vegetable;

public class VegetableNameComparator implements Comparator<Vegetable>{

	@Override
	public int compare(Vegetable vegetable1,Vegetable vegetable2) {
		// TODO Auto-generated method stub
	
		return vegetable1.getVegname().compareTo(vegetable2.getVegname());
}
}