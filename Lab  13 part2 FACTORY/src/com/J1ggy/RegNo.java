package com.J1ggy;

import java.lang.Math;
import java.lang.Math;

public class RegNo {
String RegNum;
//--Constructor-----------------------------------------
public RegNo() {
	int rand1 = (int) Math.floor((Math.random()*10));
	int rand2 = (int) Math.floor((Math.random()*10));
	String reggieNo = "SG24" + rand1 + rand2 + "K";
	this.RegNum = reggieNo;
}
//--getReg() Returns a registration number to be added to list
public String getReg() {
	return RegNum;
}
}

