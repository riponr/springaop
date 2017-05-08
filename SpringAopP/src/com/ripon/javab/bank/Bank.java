package com.ripon.javab.bank;

import org.springframework.beans.factory.annotation.Autowired;

import com.ripon.javab.bank.details.ABC;
import com.ripon.javab.bank.details.BD;

public class Bank {
	
	private ABC abc;
	private BD bd;
	
	public ABC getAbc() {
		return abc;
	}
	@Autowired
	public void setAbc(ABC abc) {
		this.abc = abc;
	}
	public BD getBd() {
		return bd;
	}
	@Autowired
	public void setBd(BD bd) {
		this.bd = bd;
	}

}
