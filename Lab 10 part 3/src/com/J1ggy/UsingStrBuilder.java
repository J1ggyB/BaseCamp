package com.J1ggy;

public class UsingStrBuilder {

	public static void main(String[] args) {
StringBuilder sb = new StringBuilder("Bob Dylan ");   //Creates a StringBuilder instance sb initialised with "Bob Dylan"
sb.append("is the artist ever!");                     // append to the String
System.out.println(sb.toString());                     //Print it
System.out.println(sb.insert(17, "greatest lyricist "));  // insert into the String at index position
System.out.println(sb.replace(35,42, ""));                // Replace a se4ction of the String
	}

}
