package com.J1ggy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyIO {

	public static void main(String[] args) throws IOException {

		String[] output = {"SittingBull, Where's your buffalo hyde?", "Eccles, Behind that tree!", "~ Spike"};
		writeCSV(output);
		readCSV("SpikeQuote.txt");
		
	}
		
		private static void writeCSV(String[] arrayToPrint)throws IOException{ // pass in String array to be printed
			 try {
			      File file = new File("SpikeQuote.txt");//File could exist or not
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
		private static void readCSV(String inFile)throws IOException{
			try {
			File file = new File(inFile);
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;//will be used to read in one line at a time but the line will have comma separation!!!
					while((line = br.readLine())!= null) {//read in lines while they exist
						System.out.println(line);
					}
			}catch(IOException e) {System.out.println("Error" + e);}
		}

}
