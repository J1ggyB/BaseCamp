package com.J1ggy;

import java.util.ArrayList;

public class Program {
	public static ArrayList<BRUSItem>Bmenu ;
	public static ArrayList<CRItem>CRmenu ;
	public static ArrayList<SGItem>SGmenu;
	
	public static void main(String[] args) {
XMLParser BRUS_Menu = new XMLParser();
	Bmenu = BRUS_Menu.getMenu();
 	System.out.println(Bmenu.toString());
 	
 	JSONParser summerGardenMenu  = new JSONParser();
 	summerGardenMenu.parse();
	SGmenu = summerGardenMenu.getMenu();
	System.out.println(SGmenu.toString());
	
	CSVParser cafeRomaMenu = new CSVParser();
	cafeRomaMenu.parseCSV();
	CRmenu = cafeRomaMenu.getMenu();
 	System.out.println(CRmenu.toString());
}
}

