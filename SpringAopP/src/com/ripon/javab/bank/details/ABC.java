package com.ripon.javab.bank.details;

import com.ripon.javap.aspect.banka;

public class ABC {
	
	String name;
	int interestrate;
	String catagory;
	int emp;
	int cus;
	
	public int getCus() {
		return cus;
	}
	public void setCus(int cus) {
		this.cus = cus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getInterestrate() {
		return interestrate;
	}
	public void setInterestrate(int interestrate) {
		this.interestrate = interestrate;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public int getEmp() {
		return emp;
	}
	public void setEmp(int emp) {
		this.emp = emp;
	}
	
	@banka
	public String toString(){  
	    System.out.println( "BankName:" +name+" Interestrate:"+interestrate+"%"+" BankCatagory:"+catagory+" NumberOfEmployee:"+emp+" NumberOfCustomer:"+cus );
		return null; 
	}  
	

}
