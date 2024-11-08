package com.J1ggy;

import java.util.ArrayDeque;                                                                      // ******* more common
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		// ArrayList------------------------------------------------------------NOT THAT FAST                      ******
		//Think of it as a mutable Array of objects - If we want primitives we must use Wrapper classes
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Bob");
		myList.add("Rob");
		myList.add("Billy");
		myList.add("Brenda");                                                                                                    //Try Integers  get an average as an int
		myList.add("Frank");
		myList.add("June");
		System.out.println(myList);
		System.out.println("****************************************");
		String strg = "";
		strg +=myList;
		String strg2 = strg.substring(1, strg.lastIndexOf(']'));
		System.out.println(strg2);
		System.out.println("**************************************");
		System.out.println(myList.get(1) + " - Should be Rob?");   //NOTICE ROUND BRACKETS
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
		myHMap.put("France", "Paris");                                                                                    //try and get the key for Wales then look up capital
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
		bikes.add("Moto Guzzi");                                                                                      //create two sets a TreeSet and a HashSet  find an item 
		bikes.add("Triumph");                                                                                              //that exists in both sets
		System.out.println(bikes);
		System.out.println(bikes.contains("Triumph"));
		for(String b : bikes) {
			System.out.println(b);
		}
		//--------------------------------------------------------------------------------------------
		System.out.println("--------------------------------------------------------");
		//--------------------------------------------------------------------------------------------
		//TreeSet--------------------------------------------------------------------------------
		//Automatically sorts the elements in natural order or using a custom comparator
		 TreeSet<String> fnames = new TreeSet<>();
	        
	        fnames.add("John");
	        fnames.add("Francis");
	        fnames.add("Amy");
	        fnames.add("Julie");
	        fnames.add("John");

	        System.out.println("Names in TreeSet: " + fnames + "\n-------------------------------------------------------");
	    //---------------------------------------------------------------------------------------------------
		//ArrayDeque - Think of it as a Queue FIFO
	        System.out.println("ArrayDeque or Queue\n-------------------------------------------------------");
		ArrayDeque<String> myQueue = new ArrayDeque<>();
		myQueue.add("Duncan");
		myQueue.add("Dave");
		myQueue.add("Deardrie");
		myQueue.add("Diane");
		myQueue.add("William");
		System.out.println(myQueue);
		while(!myQueue.isEmpty()) {
			String name = myQueue.pop();
			System.out.println("name: " + name);
		}
        System.out.println(myQueue);
		myQueue.add("Duncan");
		myQueue.add("Dave");
		myQueue.add("Deardrie");
		myQueue.add("Diane");
		myQueue.add("William");
		for(String nmes : myQueue) {
			System.out.println("names using for each loop: " + nmes);
		}
	}

}
