package com.J1ggy;

import java.io.*;
import java.util.*;

public class Program {

	public static void main(String[] args)throws Exception {//main method throws Exception
		try {
		String[]courses = readCSV("Courses.txt"); //Declare String Array to hold course titles - call readCSV()
		for(int i=0;i<courses.length;i++) {System.out.println(courses[i]);}//Prints out the Course Titles
		System.out.println("\n");
		String[]trainers = readCSV("Trainers.txt"); //Declare String Array to hold trainer names - call readCSV()
		for(int i=0;i<trainers.length;i++) {System.out.println(trainers[i]);}//Prints out the trainer names
		System.out.println("\n");
		writeCSV(courses);
		writeCSV(trainers);
		}catch(Exception e) {System.out.println("Error" + e);}
	}
	
	
	//----------------------------------------------------------------------------------------------
	private static String[] readCSV(String inFile)throws IOException{
		try {

		File file = new File(inFile);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;//will be used to read in one line at a time but the line will have comma separation!!!
		List<String> results = new ArrayList<String>();//Can't use String[] as we don't no the size yet!!!
				int column =1; //Nb: column 1 works for both trainers and courses would be better as param
				while((line = br.readLine())!= null) {//read in lines while they exist
				String[] lineHolder = line.split(",");//Each line split at commas results in a String Array!!!
				String result = lineHolder[column];//We only need the second column of the String Array a string!
				results.add(result);//add each string to an ArrayList (Remember we don't know the size yet!
			};
		       String[] response= new String[results.size()];//Create a String Array now that we have the size
		       
		        for (int i = 0; i < results.size(); i++) {//Copy the ArrayList items to the string Array
		            response[i] = results.get(i);
		        }
		        return response;//Return the String Array
		}catch(IOException e) {System.out.println("Error" + e);
		 String[] error = new String[] {"fail"};
		 return error;
		}
	}
	
	//-----------------------------------------------------------------------------------------------
	private static void writeCSV(String[] arrayToPrint)throws IOException{ // pass in String array to be printed
	 try {
	      File file = new File("TrainersAndCourses.txt");//File could exist or not
	      if (file.createNewFile()) {  
	          System.out.println("File created: " + file.getName()); //Let user no File created 
	        } else {  
	          System.out.println("File already exists.");  //Let user know File Exists
	        }  
	      BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));//Create BufferedWriter(FileWriter)
	      //NOTE: The "true" in "new FileWriter(file, true)" facilitates appending to existing file ie: not writing
	      for(int i=0;i<arrayToPrint.length;i++) {//Loop through the elements to print
	      bw.write("\n"+arrayToPrint[i]+"\n");//Print each element
	      }
	      bw.close();//Close the BufferedWriter
	      System.out.println("Successfully wrote to the file.");//update the user
	    } catch (IOException e) {//Handle Exception
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	}
}
//A couple of Useful methods worth mentioning
//Array.asList
//Collection.toArray