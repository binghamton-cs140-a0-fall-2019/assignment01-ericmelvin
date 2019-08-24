package assignment01;

/**
* Class to test assignment01 with
*/

public class TestDriver {
	
	public static void main(String[] args){
		
		DateAndPlaceOfBirth aDateAndPlaceOfBirth = new DateAndPlaceOfBirth(1999,
																			1,
																			01, 
																			"Binghamton",
																			"NY",
																			"USA");	
																			
		StreetUSAddress aStreetUSAddress = new StreetUSAddress("4 Maple Ave", 
																"", 
																"Binghamton", 
																"NY", 
																"13903");
		Person aPerson = new Person("Barrett",	
									"Sweet",
									"123456789",
									aDateAndPlaceOfBirth,
									aStreetUSAddress);
		
		System.out.print(aPerson.toString());
	}
}
