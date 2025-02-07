package com.J1ggy;

public class UsingStrBuilder {

	public static void main(String[] args) {
StringBuilder sb = new StringBuilder("\nUnlike a String a StringBuilder is mutable It contains a buffer ");   //Creates a StringBuilder instance sb initialised "
sb.append(" \nThis avoids multiple instances of garbage collection if we are adding to the String multiple times");  // append to the String
System.out.println("A String will create a new String instance each time it is manipulated and leave the old \none to be Garbage Collected");
System.out.println(sb.toString());                     //Print it
System.out.println(sb.insert(0, "Important - "));  // insert into the String at index position
System.out.println("\n I will replacethe word Important with the word Note using sb.replace(start,end,replace with);" );
System.out.println(sb.replace(sb.indexOf("Important"),sb.indexOf("Important")+9,"Note")); 
System.out.println(sb.reverse());
System.out.println(sb.capacity());
System.out.println(sb.toString());
System.out.println(sb.reverse());
System.out.println(sb.toString());
	}
}
