package com.capgemini.HashcodeandequalsMethod.Vegetable.model;
import java.util.Scanner;
import com.capgemini.HashcodeandequalsMethod.Vegetable.service.VegetableManager;

public class Vegetable implements Comparable<Vegetable> {
	

	private int vegid;
	private String vegname;
	private float vegprice;

	
	//default constructor
	public Vegetable() {
		super();
	}
	//parameterized constructor
	public Vegetable(int vegid, String vegname, float vegprice) {
		super();
		this.vegid = vegid;
		this.vegname = vegname;
		this.vegprice = vegprice;
	}
	
	public int getVegid() {
		return vegid;
	}
	public void setVegid(int vegid) {
		this.vegid = vegid;
	}
	public String getVegname() {
		return vegname;
	}
	public void setVegname(String vegname) {
		this.vegname = vegname;
	}
	public float getVegprice() {
		return vegprice;
	}
	public void setVegprice(float vegprice) {
		this.vegprice = vegprice;
	}
	
	@Override
	public int compareTo(Vegetable vegetable) {
		// TODO Auto-generated method stub
		
		return vegname.compareTo(vegetable.vegname);
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + vegid;
		result = prime * result + ((vegname == null) ? 0 : vegname.hashCode());
		result = prime * result +  Float.floatToIntBits(vegprice);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vegetable other = (Vegetable) obj;
			if (vegid!=other.vegid)
				return false;
		if (vegname == null) {
			if (other.vegname != null)
				return false;
		} else if (!vegname.equals(other.vegname))
			return false;
		if (Float.floatToIntBits(vegprice) !=Float.floatToIntBits(other.vegprice)) 
				return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vegetable Id : " + vegid + ", Name : " + vegname + ", Price : " + vegprice;
	}
	

}