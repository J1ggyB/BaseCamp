package lab03;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Program{
	private static Scanner s = new Scanner(System.in);
    private static String str = "y";
    private static int x;
	public static void main(String args[]){

//-----------Scanner-----------------------------------------------------------
//------------------------------------------------------------------------------
		while (!str.equals("n")){
		x = getInt("Please enter an int value:\n");//***Scanner moves to line initially empty
        str = getString("Please enter a String:\n");
//      str = s.nextLine();                         --another possible fix
    	System.out.println("Current String: " + str + " Current Integer: " + x + "\n");
    	System.out.println("Do you wish to continue? - Enter: y or n\n");
    	str = s.nextLine();
		}   	
	/*	String str2;
		try {
			str2 = bufReadTest();
			System.out.println(str2);
		} catch (IOException e) {
		  System.out.print(" IOError");
		  e.printStackTrace();
		}
     */
		System.out.println("Goodbye!");

	}
	public static int getInt(String prompt){
		System.out.println(prompt);
		int result = s.nextInt();
        return result;
	}
	
	public static String getString(String prompt){
		System.out.println(prompt);
		String catcher = s.nextLine();//***getInt auto creates a new empty line in Scanner
		String result = s.nextLine(); // If we call nextLine() twice -We can ignore warning
 	    return result;
	}
	//-------------------------------------------------------------------------------
	// BufferedReader---------The Old Way--------------------------------------------
/*	public static String bufReadTest() throws IOException {
				InputStreamReader in = new InputStreamReader(System.in);
		        BufferedReader bf = new BufferedReader(in);
		        System.out.println("Enter something interesting: ");
		        try {
					String myString = bf.readLine();
					return myString;
					}finally {
						bf.close();
					}
	}   */
}

