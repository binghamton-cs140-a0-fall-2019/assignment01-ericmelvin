package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PersonTester {
	public static void main(String[] args) {
		// Create DateAndPlaceOfBirth object
		DateAndPlaceOfBirth aDateAndPlaceOfBirth = new DateAndPlaceOfBirth(2000,
																			01,
																			02,
																			"Binghamton",
																			"NY",
																			"USA");
		
		// Create StreetUSAddress object
		StreetUSAddress anAddress = new StreetUSAddress("4 Moore Ave",
														"",
														"Binghamton",
														"NY",
														"13903");
		
		// Create Person object
		Person aPerson = new Person("Barrett",
									"Sweet",
									"123-45-6789",
									aDateAndPlaceOfBirth,
									anAddress);
		
		// Output person object to screen
		System.out.println(aPerson);
		
		// Output person object to file
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		
		// Output person to file
		output.println(aPerson);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
