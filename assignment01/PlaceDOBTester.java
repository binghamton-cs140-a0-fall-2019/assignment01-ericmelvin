package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PlaceDOBTester {
	public static void main(String[] args) {
		
		// Instantiate 5 DateAndPlaceOfBirth objects
		DateAndPlaceOfBirth aDateAndPlaceOfBirth1 = new DateAndPlaceOfBirth(2000, 01, 02, "Binghamton", "NY", "USA");
		DateAndPlaceOfBirth aDateAndPlaceOfBirth2 = new DateAndPlaceOfBirth(2000, 01, 02, "Rochester", "NY", "USA");
		DateAndPlaceOfBirth aDateAndPlaceOfBirth3 = new DateAndPlaceOfBirth(1999, 01, 02, "Corona Del Mar", "CA", "USA");
		DateAndPlaceOfBirth aDateAndPlaceOfBirth4 = new DateAndPlaceOfBirth(1998, 03, 04, "Stockholm", "Sweden");
		DateAndPlaceOfBirth aDateAndPlaceOfBirth5 = new DateAndPlaceOfBirth(1997, 05, 06, "Tiajuana", "Mexico");
		
		// Print 5 DateAndPlaceOfBirth objects to file
		System.out.println(aDateAndPlaceOfBirth1);
		System.out.println(aDateAndPlaceOfBirth2);
		System.out.println(aDateAndPlaceOfBirth3);
		System.out.println(aDateAndPlaceOfBirth4);
		System.out.println(aDateAndPlaceOfBirth5);
		
		// Print non-getter methods for object 1 to file
		System.out.println(aDateAndPlaceOfBirth1.olderThan(aDateAndPlaceOfBirth2));
		System.out.println(aDateAndPlaceOfBirth1.olderThan(aDateAndPlaceOfBirth3));
		System.out.println(aDateAndPlaceOfBirth1.olderThan(aDateAndPlaceOfBirth4));
		System.out.println(aDateAndPlaceOfBirth1.olderThan(aDateAndPlaceOfBirth5));
		
		System.out.println(aDateAndPlaceOfBirth1.youngerThan(aDateAndPlaceOfBirth2));
		System.out.println(aDateAndPlaceOfBirth1.youngerThan(aDateAndPlaceOfBirth3));
		System.out.println(aDateAndPlaceOfBirth1.youngerThan(aDateAndPlaceOfBirth4));
		System.out.println(aDateAndPlaceOfBirth1.youngerThan(aDateAndPlaceOfBirth5));
		
		System.out.println(aDateAndPlaceOfBirth1.hasSameBirthDateAs(aDateAndPlaceOfBirth2));
		System.out.println(aDateAndPlaceOfBirth1.hasSameBirthDateAs(aDateAndPlaceOfBirth3));
		System.out.println(aDateAndPlaceOfBirth1.hasSameBirthDateAs(aDateAndPlaceOfBirth4));
		System.out.println(aDateAndPlaceOfBirth1.hasSameBirthDateAs(aDateAndPlaceOfBirth5));
		
		System.out.println(aDateAndPlaceOfBirth1.hasSameBirthDayAs(aDateAndPlaceOfBirth2));
		System.out.println(aDateAndPlaceOfBirth1.hasSameBirthDayAs(aDateAndPlaceOfBirth3));
		System.out.println(aDateAndPlaceOfBirth1.hasSameBirthDayAs(aDateAndPlaceOfBirth4));
		System.out.println(aDateAndPlaceOfBirth1.hasSameBirthDayAs(aDateAndPlaceOfBirth5));
		
		// Print non-getter methods for object 2 to file
		System.out.println(aDateAndPlaceOfBirth2.olderThan(aDateAndPlaceOfBirth1));
		System.out.println(aDateAndPlaceOfBirth2.olderThan(aDateAndPlaceOfBirth3));
		System.out.println(aDateAndPlaceOfBirth2.olderThan(aDateAndPlaceOfBirth4));
		System.out.println(aDateAndPlaceOfBirth2.olderThan(aDateAndPlaceOfBirth5));
		
		System.out.println(aDateAndPlaceOfBirth2.youngerThan(aDateAndPlaceOfBirth1));
		System.out.println(aDateAndPlaceOfBirth2.youngerThan(aDateAndPlaceOfBirth3));
		System.out.println(aDateAndPlaceOfBirth2.youngerThan(aDateAndPlaceOfBirth4));
		System.out.println(aDateAndPlaceOfBirth2.youngerThan(aDateAndPlaceOfBirth5));
		
		System.out.println(aDateAndPlaceOfBirth2.hasSameBirthDateAs(aDateAndPlaceOfBirth1));
		System.out.println(aDateAndPlaceOfBirth2.hasSameBirthDateAs(aDateAndPlaceOfBirth3));
		System.out.println(aDateAndPlaceOfBirth2.hasSameBirthDateAs(aDateAndPlaceOfBirth4));
		System.out.println(aDateAndPlaceOfBirth2.hasSameBirthDateAs(aDateAndPlaceOfBirth5));
		
		System.out.println(aDateAndPlaceOfBirth2.hasSameBirthDayAs(aDateAndPlaceOfBirth1));
		System.out.println(aDateAndPlaceOfBirth2.hasSameBirthDayAs(aDateAndPlaceOfBirth3));
		System.out.println(aDateAndPlaceOfBirth2.hasSameBirthDayAs(aDateAndPlaceOfBirth4));
		System.out.println(aDateAndPlaceOfBirth2.hasSameBirthDayAs(aDateAndPlaceOfBirth5));
		
		// Print non-getter methods for object 3 to file
		System.out.println(aDateAndPlaceOfBirth3.olderThan(aDateAndPlaceOfBirth1));
		System.out.println(aDateAndPlaceOfBirth3.olderThan(aDateAndPlaceOfBirth2));
		System.out.println(aDateAndPlaceOfBirth3.olderThan(aDateAndPlaceOfBirth4));
		System.out.println(aDateAndPlaceOfBirth3.olderThan(aDateAndPlaceOfBirth5));
		
		System.out.println(aDateAndPlaceOfBirth3.youngerThan(aDateAndPlaceOfBirth1));
		System.out.println(aDateAndPlaceOfBirth3.youngerThan(aDateAndPlaceOfBirth2));
		System.out.println(aDateAndPlaceOfBirth3.youngerThan(aDateAndPlaceOfBirth4));
		System.out.println(aDateAndPlaceOfBirth3.youngerThan(aDateAndPlaceOfBirth5));
		
		System.out.println(aDateAndPlaceOfBirth3.hasSameBirthDateAs(aDateAndPlaceOfBirth1));
		System.out.println(aDateAndPlaceOfBirth3.hasSameBirthDateAs(aDateAndPlaceOfBirth2));
		System.out.println(aDateAndPlaceOfBirth3.hasSameBirthDateAs(aDateAndPlaceOfBirth4));
		System.out.println(aDateAndPlaceOfBirth3.hasSameBirthDateAs(aDateAndPlaceOfBirth5));
		
		System.out.println(aDateAndPlaceOfBirth2.hasSameBirthDayAs(aDateAndPlaceOfBirth1));
		System.out.println(aDateAndPlaceOfBirth2.hasSameBirthDayAs(aDateAndPlaceOfBirth2));
		System.out.println(aDateAndPlaceOfBirth2.hasSameBirthDayAs(aDateAndPlaceOfBirth4));
		System.out.println(aDateAndPlaceOfBirth2.hasSameBirthDayAs(aDateAndPlaceOfBirth5));
		
		// Print non-getter methods for object 4 to file
		System.out.println(aDateAndPlaceOfBirth4.olderThan(aDateAndPlaceOfBirth1));
		System.out.println(aDateAndPlaceOfBirth4.olderThan(aDateAndPlaceOfBirth2));
		System.out.println(aDateAndPlaceOfBirth4.olderThan(aDateAndPlaceOfBirth3));
		System.out.println(aDateAndPlaceOfBirth4.olderThan(aDateAndPlaceOfBirth5));
		
		System.out.println(aDateAndPlaceOfBirth4.youngerThan(aDateAndPlaceOfBirth1));
		System.out.println(aDateAndPlaceOfBirth4.youngerThan(aDateAndPlaceOfBirth2));
		System.out.println(aDateAndPlaceOfBirth4.youngerThan(aDateAndPlaceOfBirth3));
		System.out.println(aDateAndPlaceOfBirth4.youngerThan(aDateAndPlaceOfBirth5));
		
		System.out.println(aDateAndPlaceOfBirth4.hasSameBirthDateAs(aDateAndPlaceOfBirth1));
		System.out.println(aDateAndPlaceOfBirth4.hasSameBirthDateAs(aDateAndPlaceOfBirth2));
		System.out.println(aDateAndPlaceOfBirth4.hasSameBirthDateAs(aDateAndPlaceOfBirth3));
		System.out.println(aDateAndPlaceOfBirth4.hasSameBirthDateAs(aDateAndPlaceOfBirth5));
		
		System.out.println(aDateAndPlaceOfBirth4.hasSameBirthDayAs(aDateAndPlaceOfBirth1));
		System.out.println(aDateAndPlaceOfBirth4.hasSameBirthDayAs(aDateAndPlaceOfBirth2));
		System.out.println(aDateAndPlaceOfBirth4.hasSameBirthDayAs(aDateAndPlaceOfBirth3));
		System.out.println(aDateAndPlaceOfBirth4.hasSameBirthDayAs(aDateAndPlaceOfBirth5));
		
		// Print non-getter methods for object 5 to file
		System.out.println(aDateAndPlaceOfBirth5.olderThan(aDateAndPlaceOfBirth1));
		System.out.println(aDateAndPlaceOfBirth5.olderThan(aDateAndPlaceOfBirth2));
		System.out.println(aDateAndPlaceOfBirth5.olderThan(aDateAndPlaceOfBirth3));
		System.out.println(aDateAndPlaceOfBirth5.olderThan(aDateAndPlaceOfBirth4));
		
		System.out.println(aDateAndPlaceOfBirth5.youngerThan(aDateAndPlaceOfBirth1));
		System.out.println(aDateAndPlaceOfBirth5.youngerThan(aDateAndPlaceOfBirth2));
		System.out.println(aDateAndPlaceOfBirth5.youngerThan(aDateAndPlaceOfBirth3));
		System.out.println(aDateAndPlaceOfBirth5.youngerThan(aDateAndPlaceOfBirth4));
		
		System.out.println(aDateAndPlaceOfBirth5.hasSameBirthDateAs(aDateAndPlaceOfBirth1));
		System.out.println(aDateAndPlaceOfBirth5.hasSameBirthDateAs(aDateAndPlaceOfBirth2));
		System.out.println(aDateAndPlaceOfBirth5.hasSameBirthDateAs(aDateAndPlaceOfBirth3));
		System.out.println(aDateAndPlaceOfBirth5.hasSameBirthDateAs(aDateAndPlaceOfBirth4));
		
		System.out.println(aDateAndPlaceOfBirth5.hasSameBirthDayAs(aDateAndPlaceOfBirth1));
		System.out.println(aDateAndPlaceOfBirth5.hasSameBirthDayAs(aDateAndPlaceOfBirth2));
		System.out.println(aDateAndPlaceOfBirth5.hasSameBirthDayAs(aDateAndPlaceOfBirth3));
		System.out.println(aDateAndPlaceOfBirth5.hasSameBirthDayAs(aDateAndPlaceOfBirth4));
		
		// Instantiate 5 DateAndPlaceOfBirth objects
		DateAndPlaceOfBirth aDateAndPlaceOfBirth12 = new DateAndPlaceOfBirth(2000, 01, 02, "Binghamton", "NY", "USA");
		DateAndPlaceOfBirth aDateAndPlaceOfBirth22 = new DateAndPlaceOfBirth(2000, 01, 02, "Rochester", "NY", "USA");
		DateAndPlaceOfBirth aDateAndPlaceOfBirth32 = new DateAndPlaceOfBirth(1999, 01, 02, "Corona Del Mar", "CA", "USA");
		DateAndPlaceOfBirth aDateAndPlaceOfBirth42 = new DateAndPlaceOfBirth(1998, 03, 04, "Stockholm", "Sweden");
		DateAndPlaceOfBirth aDateAndPlaceOfBirth52 = new DateAndPlaceOfBirth(1997, 05, 06, "Tiajuana", "Mexico");
		
		try(var output = new PrintWriter(new FileOutputStream(
		new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
			
			// Print 5 DateAndPlaceOfBirth objects to file
			output.println(aDateAndPlaceOfBirth12);
			output.println(aDateAndPlaceOfBirth22);
			output.println(aDateAndPlaceOfBirth32);
			output.println(aDateAndPlaceOfBirth42);
			output.println(aDateAndPlaceOfBirth52);
			
			// Print non-getter methods for object 1 to file
			output.println(aDateAndPlaceOfBirth12.olderThan(aDateAndPlaceOfBirth22));
			output.println(aDateAndPlaceOfBirth12.olderThan(aDateAndPlaceOfBirth32));
			output.println(aDateAndPlaceOfBirth12.olderThan(aDateAndPlaceOfBirth42));
			output.println(aDateAndPlaceOfBirth12.olderThan(aDateAndPlaceOfBirth52));
			
			output.println(aDateAndPlaceOfBirth12.youngerThan(aDateAndPlaceOfBirth22));
			output.println(aDateAndPlaceOfBirth12.youngerThan(aDateAndPlaceOfBirth32));
			output.println(aDateAndPlaceOfBirth12.youngerThan(aDateAndPlaceOfBirth42));
			output.println(aDateAndPlaceOfBirth12.youngerThan(aDateAndPlaceOfBirth52));
			
			output.println(aDateAndPlaceOfBirth12.hasSameBirthDateAs(aDateAndPlaceOfBirth22));
			output.println(aDateAndPlaceOfBirth12.hasSameBirthDateAs(aDateAndPlaceOfBirth32));
			output.println(aDateAndPlaceOfBirth12.hasSameBirthDateAs(aDateAndPlaceOfBirth42));
			output.println(aDateAndPlaceOfBirth12.hasSameBirthDateAs(aDateAndPlaceOfBirth52));
			
			output.println(aDateAndPlaceOfBirth12.hasSameBirthDayAs(aDateAndPlaceOfBirth22));
			output.println(aDateAndPlaceOfBirth12.hasSameBirthDayAs(aDateAndPlaceOfBirth32));
			output.println(aDateAndPlaceOfBirth12.hasSameBirthDayAs(aDateAndPlaceOfBirth42));
			output.println(aDateAndPlaceOfBirth12.hasSameBirthDayAs(aDateAndPlaceOfBirth52));
			
			// Print non-getter methods for object 2 to file
			output.println(aDateAndPlaceOfBirth22.olderThan(aDateAndPlaceOfBirth12));
			output.println(aDateAndPlaceOfBirth22.olderThan(aDateAndPlaceOfBirth32));
			output.println(aDateAndPlaceOfBirth22.olderThan(aDateAndPlaceOfBirth42));
			output.println(aDateAndPlaceOfBirth22.olderThan(aDateAndPlaceOfBirth52));
			
			output.println(aDateAndPlaceOfBirth22.youngerThan(aDateAndPlaceOfBirth12));
			output.println(aDateAndPlaceOfBirth22.youngerThan(aDateAndPlaceOfBirth32));
			output.println(aDateAndPlaceOfBirth22.youngerThan(aDateAndPlaceOfBirth42));
			output.println(aDateAndPlaceOfBirth22.youngerThan(aDateAndPlaceOfBirth52));
			
			output.println(aDateAndPlaceOfBirth22.hasSameBirthDateAs(aDateAndPlaceOfBirth12));
			output.println(aDateAndPlaceOfBirth22.hasSameBirthDateAs(aDateAndPlaceOfBirth32));
			output.println(aDateAndPlaceOfBirth22.hasSameBirthDateAs(aDateAndPlaceOfBirth42));
			output.println(aDateAndPlaceOfBirth22.hasSameBirthDateAs(aDateAndPlaceOfBirth52));
			
			output.println(aDateAndPlaceOfBirth22.hasSameBirthDayAs(aDateAndPlaceOfBirth12));
			output.println(aDateAndPlaceOfBirth22.hasSameBirthDayAs(aDateAndPlaceOfBirth32));
			output.println(aDateAndPlaceOfBirth22.hasSameBirthDayAs(aDateAndPlaceOfBirth42));
			output.println(aDateAndPlaceOfBirth22.hasSameBirthDayAs(aDateAndPlaceOfBirth52));
			
			// Print non-getter methods for object 3 to file
			output.println(aDateAndPlaceOfBirth32.olderThan(aDateAndPlaceOfBirth12));
			output.println(aDateAndPlaceOfBirth32.olderThan(aDateAndPlaceOfBirth22));
			output.println(aDateAndPlaceOfBirth32.olderThan(aDateAndPlaceOfBirth42));
			output.println(aDateAndPlaceOfBirth32.olderThan(aDateAndPlaceOfBirth52));
			
			output.println(aDateAndPlaceOfBirth32.youngerThan(aDateAndPlaceOfBirth12));
			output.println(aDateAndPlaceOfBirth32.youngerThan(aDateAndPlaceOfBirth22));
			output.println(aDateAndPlaceOfBirth32.youngerThan(aDateAndPlaceOfBirth42));
			output.println(aDateAndPlaceOfBirth32.youngerThan(aDateAndPlaceOfBirth52));
			
			output.println(aDateAndPlaceOfBirth32.hasSameBirthDateAs(aDateAndPlaceOfBirth12));
			output.println(aDateAndPlaceOfBirth32.hasSameBirthDateAs(aDateAndPlaceOfBirth22));
			output.println(aDateAndPlaceOfBirth32.hasSameBirthDateAs(aDateAndPlaceOfBirth42));
			output.println(aDateAndPlaceOfBirth32.hasSameBirthDateAs(aDateAndPlaceOfBirth52));
			
			output.println(aDateAndPlaceOfBirth22.hasSameBirthDayAs(aDateAndPlaceOfBirth12));
			output.println(aDateAndPlaceOfBirth22.hasSameBirthDayAs(aDateAndPlaceOfBirth22));
			output.println(aDateAndPlaceOfBirth22.hasSameBirthDayAs(aDateAndPlaceOfBirth42));
			output.println(aDateAndPlaceOfBirth22.hasSameBirthDayAs(aDateAndPlaceOfBirth52));
			
			// Print non-getter methods for object 4 to file
			output.println(aDateAndPlaceOfBirth42.olderThan(aDateAndPlaceOfBirth12));
			output.println(aDateAndPlaceOfBirth42.olderThan(aDateAndPlaceOfBirth22));
			output.println(aDateAndPlaceOfBirth42.olderThan(aDateAndPlaceOfBirth32));
			output.println(aDateAndPlaceOfBirth42.olderThan(aDateAndPlaceOfBirth52));
			
			output.println(aDateAndPlaceOfBirth42.youngerThan(aDateAndPlaceOfBirth12));
			output.println(aDateAndPlaceOfBirth42.youngerThan(aDateAndPlaceOfBirth22));
			output.println(aDateAndPlaceOfBirth42.youngerThan(aDateAndPlaceOfBirth32));
			output.println(aDateAndPlaceOfBirth42.youngerThan(aDateAndPlaceOfBirth52));
			
			output.println(aDateAndPlaceOfBirth42.hasSameBirthDateAs(aDateAndPlaceOfBirth12));
			output.println(aDateAndPlaceOfBirth42.hasSameBirthDateAs(aDateAndPlaceOfBirth22));
			output.println(aDateAndPlaceOfBirth42.hasSameBirthDateAs(aDateAndPlaceOfBirth32));
			output.println(aDateAndPlaceOfBirth42.hasSameBirthDateAs(aDateAndPlaceOfBirth52));
			
			output.println(aDateAndPlaceOfBirth42.hasSameBirthDayAs(aDateAndPlaceOfBirth12));
			output.println(aDateAndPlaceOfBirth42.hasSameBirthDayAs(aDateAndPlaceOfBirth22));
			output.println(aDateAndPlaceOfBirth42.hasSameBirthDayAs(aDateAndPlaceOfBirth32));
			output.println(aDateAndPlaceOfBirth42.hasSameBirthDayAs(aDateAndPlaceOfBirth52));
			
			// Print non-getter methods for object 5 to file
			output.println(aDateAndPlaceOfBirth52.olderThan(aDateAndPlaceOfBirth12));
			output.println(aDateAndPlaceOfBirth52.olderThan(aDateAndPlaceOfBirth22));
			output.println(aDateAndPlaceOfBirth52.olderThan(aDateAndPlaceOfBirth32));
			output.println(aDateAndPlaceOfBirth52.olderThan(aDateAndPlaceOfBirth42));
			
			output.println(aDateAndPlaceOfBirth52.youngerThan(aDateAndPlaceOfBirth12));
			output.println(aDateAndPlaceOfBirth52.youngerThan(aDateAndPlaceOfBirth22));
			output.println(aDateAndPlaceOfBirth52.youngerThan(aDateAndPlaceOfBirth32));
			output.println(aDateAndPlaceOfBirth52.youngerThan(aDateAndPlaceOfBirth42));
			
			output.println(aDateAndPlaceOfBirth52.hasSameBirthDateAs(aDateAndPlaceOfBirth12));
			output.println(aDateAndPlaceOfBirth52.hasSameBirthDateAs(aDateAndPlaceOfBirth22));
			output.println(aDateAndPlaceOfBirth52.hasSameBirthDateAs(aDateAndPlaceOfBirth32));
			output.println(aDateAndPlaceOfBirth52.hasSameBirthDateAs(aDateAndPlaceOfBirth42));
			
			output.println(aDateAndPlaceOfBirth52.hasSameBirthDayAs(aDateAndPlaceOfBirth12));
			output.println(aDateAndPlaceOfBirth52.hasSameBirthDayAs(aDateAndPlaceOfBirth22));
			output.println(aDateAndPlaceOfBirth52.hasSameBirthDayAs(aDateAndPlaceOfBirth32));
			output.println(aDateAndPlaceOfBirth52.hasSameBirthDayAs(aDateAndPlaceOfBirth42));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
