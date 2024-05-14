package com.J1ggy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// ArrayList------------------------------------------------------------
		List <String> myList = new ArrayList<>();
		myList.add("Bob");
		myList.add("Rob");
		myList.add("Billy");
		myList.add("Brenda");
		myList.add("Frank");
		System.out.println(myList);
		System.out.println(myList.get(1) + " - Should be Rob?");
		System.out.println("Why should it be Rob");
		//--------------------------------------------------------------------------
		System.out.println("----------------------------------");
		// Linked List-------------------------------------------------------------
		//A LinkedList is a list of containers where each one holds a link to the next and the list has a link to the first.
		LinkedList <String> names = new LinkedList<>();
		names.add("Sarah");
		names.add("Sally");
		names.add("Simon");
		names.add("Suzie");
		names.add("Jim");
		System.out.println(names);
		names.addFirst("Andrew");
		System.out.println(names);
		String str = names.getLast();
		System.out.println(str);
		//-----------------------------------------------------------------------------------------
		System.out.println("-----------------------------------------------");
		// HashMap---------------------------------------------------------------------------------
		HashMap<String, String> myHMap = new HashMap<>();
		myHMap.put("Scotland", "Edinburgh");
		myHMap.put("Ireland", "Dublin");
		myHMap.put("Wales", "Cardiff");
		myHMap.put("England", "London");
		myHMap.put("France", "Paris");
		System.out.println(myHMap);
		String Sct = myHMap.get("Scotland");
		System.out.println("The capital of Scotland is: " + Sct);
		myHMap.remove("England");
		System.out.println(myHMap);
		System.out.println(myHMap.size());
		for(String caps : myHMap.values()) {
			System.out.println(caps);
		}
		for(String Conts : myHMap.keySet()) {
			System.out.println(Conts);
		}
		//-------------------------------------------------------------------------------------------
		System.out.println("------------------------------------------------");
		// HashSet----------------------------------------------------------------------------------
		HashSet<String> bikes = new HashSet<>();
		bikes.add("Triumph");
		bikes.add("Ducatti");
		bikes.add("BSA");
		bikes.add("Royal Enfield");
		bikes.add("Moto Guzzi");
		bikes.add("Triumph");
		System.out.println(bikes);
		System.out.println(bikes.contains("Triumph"));
		for(String b : bikes) {
			System.out.println(b);
		}
	}

}
