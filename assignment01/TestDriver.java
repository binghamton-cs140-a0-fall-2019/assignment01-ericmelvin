package assignment01;

/**
* Class to test assignment01 with
*/

public class TestDriver {
	
	public static void main(String[] args){
		
		// Create DateAndPlaceOfBirth object
		DateAndPlaceOfBirth aDateAndPlaceOfBirth = new DateAndPlaceOfBirth(1999,
																			1,
																			01, 
																			"Binghamton",
																			"NY",
																			"USA");	
		
		// Create DateAndPlaceOfBirth object
		DateAndPlaceOfBirth anotherDateAndPlaceOfBirth = new DateAndPlaceOfBirth(1999,
		1,
		01, 
		"Binghamton",
		"NY",
		"USA");	
		
		// Create DateAndPlaceOfBirth object
		DateAndPlaceOfBirth aThirdDateAndPlaceOfBirth = new DateAndPlaceOfBirth(1999,
		1,
		02, 
		"Binghamton",
		"NY",
		"USA");	
		
		// Create StreetUSAddress object		
		StreetUSAddress aStreetUSAddress = new StreetUSAddress("4 Maple Ave", 
																"", 
																"Binghamton", 
																"NY", 
																"13903");
																
		// Create Person object
		Person aPerson = new Person("Barrett",	
									"Sweet",
									"123456789",
									aDateAndPlaceOfBirth,
									aStreetUSAddress);
		
		// Testing hasSameBirthDayAs method
		System.out.println("These birthday's should match (true)");
		System.out.println(aDateAndPlaceOfBirth.hasSameBirthDayAs(anotherDateAndPlaceOfBirth));
		System.out.println("These birthday's shouldn't match (false)");
		System.out.println(aDateAndPlaceOfBirth.hasSameBirthDayAs(aThirdDateAndPlaceOfBirth));
		
		// Testing toString method
		System.out.print(aPerson.toString());
		
		// Testing get methods for StreetUSAddress
		System.out.println("\n\n" + aStreetUSAddress.getAddressLine1());
		System.out.println(aStreetUSAddress.getAddressLine2());
		System.out.println(aStreetUSAddress.getCity());
		System.out.println(aStreetUSAddress.getStateAbbreviation());
		System.out.println(aStreetUSAddress.getZipCode());
	}
}
