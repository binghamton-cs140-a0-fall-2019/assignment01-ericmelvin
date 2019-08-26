package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class USAddressTester {
	public static void main(String[] args) {
		StreetUSAddress anAddress1 = new StreetUSAddress("4 Moore Ave",
														"",
														"Binghamton",
														"NY",
														"13903");
														
		StreetUSAddress anAddress2 = new StreetUSAddress("5 Moore Ave",
															"Apt 2",
															"Binghamton",
															"NY",
															"13903");

		// Print address objects to screen
		System.out.println(anAddress1);
		System.out.println(anAddress2);
		
		// Print to output file
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		
		StreetUSAddress anAddress12 = new StreetUSAddress("4 Moore Ave",
														"",
														"Binghamton",
														"NY",
														"13903");
														
		StreetUSAddress anAddress22 = new StreetUSAddress("5 Moore Ave",
															"Apt 2",
															"Binghamton",
															"NY",
															"13903");
		
		output.println(anAddress12);
		output.println(anAddress22);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}
