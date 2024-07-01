import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.*;
public class Customer {
    String CustomerID, CompanyName, ContactName, ContactTitle;
    String Address, PostCode, Country,Phone, Fax;
    public static void main(String[] args)throws IOException{
        Gson gson = new Gson();//Create new instance of Gson Class
   	    String fileName = "/home/watso/Repo_1/QA/Lab 12 part 2/src/JSONFile.json";//Give the path to the file
        String content = new String(Files.readAllBytes(Paths.get(fileName)));//Read file at path into String
   	    Customer[] customers = gson.fromJson(content, Customer[].class);//fromJson() converts Json content to Java objects
   	    System.out.println("\tCustID\tContact Name\tPhoneNo"); //Now we have an array of customers to Loop
   	    for(int i=0; i < customers.length;i++) {
   	    System.out.print("\t" + customers[i].CustomerID);
   	    System.out.print("\t" + customers[i].ContactName);
   	    System.out.println("\t" + customers[i].Phone);
   	    }
   	    int[] nos = {1,3,5,7,9};
		String res = gson.toJson(nos);
		System.out.println(res);

		String[] names= {"Bob","Fred","Wilma"};
		res = gson.toJson(names);
		System.out.println(res);
		//Nb: Changed Class to StudenInst as I couldn't remember whether we had a Student Class defined already - Lol
		StudentInst[] students = {
				new StudentInst("Bob",21), 
				new StudentInst("Fred",32), 
				new StudentInst("Wilma",26)
		};
		res = gson.toJson(students);
		System.out.println(res);
   	    }
}


