package com.J1ggy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class AssociateCourseTutor {

	public static void main(String[] args)throws Exception {
		try {

		String[]courses = readCSV("Courses.txt"); //Declare String Array to hold course titles - call readCSV()
		for(int i=0;i<courses.length;i++) {System.out.println(courses[i]);}//Prints out the Course Titles
		System.out.println("\n");
		String[]trainers = readCSV("Trainers.txt"); //Declare String Array to hold trainer names - call readCSV()
		for(int i=0;i<trainers.length;i++) {System.out.println(trainers[i]);}//Prints out the trainer names
		System.out.println("\n");
		
		System.out.println("TUTOR RESPONSIBILITIES:\n");
		ArrayList<HashMap<String,String>> responsibilities= new ArrayList<>();
		if(courses != null && trainers != null) {
			responsibilities = readAssociations("associations.txt");
			for (int i=0;i<responsibilities.size();i++) {

						HashMap<String,String> dataSet = responsibilities.get(i);
						for (String x : dataSet.keySet()) {
						String tutor = x;
						String course =dataSet.get(x);

						switch(tutor) {
						case "1":
						    tutor = trainers[1];
						break;
						case "2":
						    tutor = trainers[2];
						break;
						case "3":
						    tutor = trainers[3];
						break;
						case "4":
						    tutor= trainers[4];
						break;
						case "5":
						    tutor = trainers[5];
						break;
						}//End switch
						switch(course) {
						case "11001":
						    course = courses[1];
						break;
						case "11002" :
						    course = courses[2];
						break;
						case"11003" :
						    course = courses[3];
						break;
						case "11004" :
						    course = courses[4];
							//System.out.println(tutor + "\t" + course +"\n");
						break;
						case "11005" :
						    course = courses[5];
						break;
						}//End switch
						System.out.println(tutor + "-" + course +"\n");
					}//End dataSet Loop
				}//End For repons Loop
			}//check data loaded from courses & trainers

		}catch(Exception e) {System.out.println("Error: "+ e);}
	}//End of Main
//-------------------------------------------------------------------------------------------------------------	
	private static String[] readCSV(String inFile)throws IOException{
		try {
		File file = new File(inFile);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;//will be used to read in one line at a time but the line will have comma separation!!!
		List<String> results = new ArrayList<String>();//Can't use String[] as we don't no the size yet!!!
				int column = 1; //Nb: column 1 works for both trainers and courses would be better as param
				while((line = br.readLine())!= null) {//read in lines while they exist
				String[] lineHolder = line.split(",");//Each line split at commas results in a String Array!!!
				String result = lineHolder[column];//We only need the second column of the String Array a string!
				results.add(result);//add each string to an ArrayList (Remember we don't know the size yet!
			};
		       String[] response= new String[results.size()];//Create a String Array now that we have the size
		       
		        for (int i = 0; i < results.size(); i++) {//Copy the ArrayList items to the string Array
		            response[i] = results.get(i);
		        }
		        br.close();
		        return response;//Return the String Array
		
			}catch(IOException e) {System.out.println("Error:" + e);
		 	 String[] error = new String[] {"fail"};
		 	 return error;
			}
	}
	
//--------------------------------------------------------------------------------------------------
	private static ArrayList<HashMap<String,String>> readAssociations(String inFile)throws IOException{
		try {
		File file = new File(inFile);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;//will be used to read in one line at a time but the line will have comma separation!!!
		ArrayList<HashMap<String,String>> associations = new ArrayList<>();//Can't use String[] as we don't no the size yet!!!
				while((line = br.readLine())!= null) {//read in lines while they exist
				String[] lineHolder = line.split(",");//Each line split at commas results in a String Array!!!
				HashMap<String,String> HM = new HashMap<>();
				HM.put(lineHolder[0], lineHolder[1]);
				associations.add(HM);
				};
				br.close();
				return associations;
				}catch(IOException e){System.out.println("Error:" + e);
				ArrayList<HashMap<String,String>> err = new ArrayList<>();
				return err;
				}
				
				
}
}				
