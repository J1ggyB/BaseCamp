package com.J1ggy;

public class Program {

	public static void main(String[] args) {
String name = "Fonton Jibbertree";

System.out.println("Should be an \"n\" at the 3rd position - and we found an: " + name.charAt(2)); //remember indexed from 0
System.out.println("Should be an \"n\" at the 3rd position - and we found an: " + name.substring(2,3) + " Again!!!");//start/end index
System.out.println("I'd rather have found a " + name.substring(0,3) + "g or a simple " + name.substring(8,14)+"eegong...");
System.out.println("As it is all just jigglyfrong my friend. It's Jabba all gone wrong!!!");
System.out.println(name.toUpperCase());
System.out.println(name.toLowerCase());
System.out.println(name);
char[] chars = name.toCharArray(); //Convert the String to a char array
String s = "";						//We will use this to build a new String called s
	for (int c: chars) {					//For each char in the array chars[]
		 s += Character.toString(c) +"\t";   //Convert the char at c to a String concatenate on a tab and assign to s plus itself
		}
    System.out.println(s);                //Prints String s with a new line
    System.out.println("Starts with F? " + s.startsWith("F")); //Check if s starts with an F character - true
    System.out.println("Ends with H? " + s.endsWith("H"));      //Check if s ends with an H character - false
    System.out.println(s.indexOf('b') + " - Additional chars are from the tabs"); //print index of first occurrence of b (count tabs)
    if(s.indexOf('z') == -1) {										//indexOf() throws -1 if char not found
    System.out.println("Character does not appear in the String");  //Notify user that char not found
    s = s.replaceAll("\t","").substring(0,6)+ "";     //Uses REG Expression to get rid of whitespace/substrings/Appends
    System.out.println("My new Full Name is: " + s);                //Print out the new Full Name
    }
	}
}
