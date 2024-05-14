package com.J1ggy;

import java.util.ArrayDeque;                                                                      // ******* more common
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// ArrayList------------------------------------------------------------NOT THAT FAST                      ******
		//Think of it as a mutable Array of objects - If we want primitives we must use Wrapper classes
		ArrayList <String> myList = new ArrayList<>();
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
		// Linked List-------------------------------------------------------------SLOW
		//A LinkedList is a list of containers where each one holds a link to the next and the list has a link to the first.
		//Can be used when addition rate is much higher than retrieve - often used for a queue.
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
		// HashMap---------------------------------------------------------------------------------     ******
		//A HashMap is basically a Dictionary it holds key value pairs (Forget about indexes)
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
		// HashSet----------------------------------------------------------------------------------          *******
		//The main purpose is to avoid duplication
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
		//--------------------------------------------------------------------------------------------
		System.out.println("--------------------------------------------------------");
		//--------------------------------------------------------------------------------------------
		//ArrayDeque
		ArrayDeque<String> myQueue = new ArrayDeque<>();
		myQueue.add("Duncan");
		myQueue.add("Dave");
		myQueue.add("Deardrie");
		myQueue.add("Diane");
		myQueue.add("William");
		System.out.println(myQueue);
		while(!myQueue.isEmpty()) {
			String name = myQueue.pop();
			System.out.println(name);
		}
        System.out.println(myQueue);
		myQueue.add("Duncan");
		myQueue.add("Dave");
		myQueue.add("Deardrie");
		myQueue.add("Diane");
		myQueue.add("William");
		for(String nmes : myQueue) {
			System.out.println(nmes);
		}
	}

}
