package com.J1ggy;

import java.util.ArrayList;
import java.util.List;

public class RegListGenerator {
	List<String> RegNos = new ArrayList<String>();
	
	//Just a Default Constructor----------------------------------------

	public RegListGenerator() {
		super();
	}
	
	//Methods-----------------------------------------------------------
	//---findRegNo return a registration number--------------------------
	public String findRegNo(int x) {
		String reg = this.RegNos.get(x);
		return reg;
	}
	//--addReg----Adds a regNo String to the Arraylist RegNos
	public void addReg(String reg) {
		this.RegNos.add(reg);
	}
	//---create Registration numbers------------------------------------
	public void createRegNos(int num) {
			for(int i = 0; i < num ; i++) {			
				RegNo rg = new RegNo();
				String reg = rg.getReg();
				if(! RegNos.contains(reg)) {
					RegNos.add(reg);
				}
			}
	}
	public int getListSize() {
		int Size = this.RegNos.size();
		return Size;
	}

}
