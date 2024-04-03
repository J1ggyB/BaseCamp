package com.J1ggy;

public class Program {

	public static void main(String[] args) {
String name = "William";
System.out.println(name.charAt(2));   //Remember CharAt() returns a char
System.out.println(Character.toUpperCase(name.charAt(2)));
System.out.println(Character.toLowerCase(name.charAt(2)));

System.out.println(name.substring(2,3));  //Returns a String of one character
System.out.println(name.substring(2,3).toUpperCase());
System.out.println(name.substring(2,3).toLowerCase());

char[] myCharArray = name.toCharArray();
for( char c : myCharArray) {
	System.out.print(c + "\t");   // \t is tab   \n is line feed
		}
	System.out.print("I should be on the same line");
	System.out.print("\n");  //Nb: println() auto line feeds print() does not
	System.out.println("I should be on a new line");
	String result =  (name.startsWith("W")) ? "true" : "false";  //ternary operator
	System.out.println(result);
	String endResult =  (name.endsWith("W")) ? "true" : "false";  //ternary operator
	System.out.println(endResult);
	
	int[] results = new int[2];
	results[0] = name.indexOf('m');
	results[1] = name.indexOf('t');
	for(int i : results) {
				if(i == -1) {System.out.println("Char not in string");} // -1 if not found
				else{System.out.println("The Character is at position: " + i);}
				}
	
	String fullName = name + " Watson";
	System.out.println(fullName);
	
	StringBuilder sb = new StringBuilder("Hieronymous Bosch ");
	sb.append("is the artist ever!");
	System.out.println(sb.toString());
	sb.insert(25,"most unsettling ");
	System.out.println(sb.toString());
	sb.replace(41, 47, "dude");
	System.out.println(sb.toString());
	}//end main

}
