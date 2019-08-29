package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerOwnerTester {
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
									anAddress
									);
		
		// Create four computer objects
		Computer computer1 = new Computer("Dell",
											"Intel i7",
											16,
											500,
											false,
											1000.00);
											
		Computer computer2 = new Computer("IBM",
											"Intel i5",
											32,
											2000,
											true,
											1200.00);
											
		Computer computer3 = new Computer("HP",
											"AMD",
											64,
											2750,
											false,
											1800.94);
											
		Computer computer4 = new Computer("Compaq",
											"Intel i3",
											8,
											250,
											true,
											799.99);
		
		// Create computerOwner object
		ComputerOwner aComputerOwner = new ComputerOwner(aPerson);
		
		// Add four computer objects to ComputerOwner object
		aComputerOwner.addComputer(computer1);
		aComputerOwner.addComputer(computer2);
		aComputerOwner.addComputer(computer3);
		aComputerOwner.addComputer(computer4);
		
		// Print computerOwner to screen
		System.out.println(aComputerOwner);
		
		// Remove two computers from computerOwner
		aComputerOwner.removeComputer(0);
		aComputerOwner.removeComputer(1);
		
		// Print computerOwner to screen
		System.out.println(aComputerOwner);
		
		// Print computerOwner to file
		try(var output = new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");
		
		// Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		
		// Create DateAndPlaceOfBirth object
		DateAndPlaceOfBirth aDateAndPlaceOfBirth2 = new DateAndPlaceOfBirth(2000,
																			01,
																			02,
																			"Binghamton",
																			"NY",
																			"USA");
		
		// Create StreetUSAddress object
		StreetUSAddress anAddress2 = new StreetUSAddress("4 Moore Ave",
														"",
														"Binghamton",
														"NY",
														"13903");
		// Create Person object
		Person aPerson2 = new Person("Barrett",
									"Sweet",
									"123-45-6789",
									aDateAndPlaceOfBirth,
									anAddress
									);
		
		// Create four computer objects
		Computer computer12 = new Computer("Dell",
											"Intel i7",
											16,
											500,
											false,
											1000.00);
											
		Computer computer22 = new Computer("IBM",
											"Intel i5",
											32,
											2000,
											true,
											1200.00);
											
		Computer computer32 = new Computer("HP",
											"AMD",
											64,
											2750,
											false,
											1800.94);
											
		Computer computer42 = new Computer("Compaq",
											"Intel i3",
											8,
											250,
											true,
											799.99);

		// Create computerOwner object
		ComputerOwner aComputerOwner2 = new ComputerOwner(aPerson);
		
		// Add four computer objects to ComputerOwner object
		aComputerOwner2.addComputer(computer12);
		aComputerOwner2.addComputer(computer22);
		aComputerOwner2.addComputer(computer32);
		aComputerOwner2.addComputer(computer42);
		
		// Print computerOwner to screen
		output.println(aComputerOwner2);
		
		// Remove two computers from computerOwner
		aComputerOwner2.removeComputer(0);
		aComputerOwner2.removeComputer(1);
		
		// Print computerOwner to screen
		output.println(aComputerOwner2);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
