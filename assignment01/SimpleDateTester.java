package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SimpleDateTester {
	public static void main(String[] args) {
		
		// Create some simple date objects for testing
		SimpleDate aSimpleDate = SimpleDate.of(1999, 02, 02);
		SimpleDate lessSimpleDateYear = SimpleDate.of(1998, 02, 02);
		SimpleDate lessSimpleDateMonth = SimpleDate.of(1999, 01, 02);
		SimpleDate lessSimpleDateDay = SimpleDate.of(1999, 02, 01);
		SimpleDate greaterSimpleDateYear = SimpleDate.of(2000, 02, 02);
		SimpleDate greaterSimpleDateMonth = SimpleDate.of(1999, 03, 02);
		SimpleDate greaterSimpleDateDay = SimpleDate.of(1999, 02, 03);
		
		System.out.println("TESTS FOR SimpleDate.java");
		// Print before method with less than dates - should return false
		System.out.println("Less than dates - should print false");
		System.out.println(aSimpleDate.before(lessSimpleDateYear));
		System.out.println(aSimpleDate.before(lessSimpleDateMonth));
		System.out.println(aSimpleDate.before(lessSimpleDateDay));
		
		// Print before method with greater than dates - should print true
		System.out.println("Greater than dates - should print true");
		System.out.println(aSimpleDate.before(greaterSimpleDateYear));
		System.out.println(aSimpleDate.before(greaterSimpleDateMonth));
		System.out.println(aSimpleDate.before(greaterSimpleDateDay));
		
		try(var output = new PrintWriter(new FileOutputStream(
		new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR SimpleDate.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println

		// Create some simple date objects for testing
		SimpleDate aSimpleDate2 = SimpleDate.of(1999, 02, 02);
		SimpleDate lessSimpleDateYear2 = SimpleDate.of(1998, 02, 02);
		SimpleDate lessSimpleDateMonth2 = SimpleDate.of(1999, 01, 02);
		SimpleDate lessSimpleDateDay2 = SimpleDate.of(1999, 02, 01);
		SimpleDate greaterSimpleDateYear2 = SimpleDate.of(2000, 02, 02);
		SimpleDate greaterSimpleDateMonth2 = SimpleDate.of(1999, 03, 02);
		SimpleDate greaterSimpleDateDay2 = SimpleDate.of(1999, 02, 03);
		
		// Print before method with less than dates - should return false
		output.println("Less than dates - should print false");
		output.println(aSimpleDate2.before(lessSimpleDateYear2));
		output.println(aSimpleDate2.before(lessSimpleDateMonth2));
		output.println(aSimpleDate2.before(lessSimpleDateDay2));
		
		// Print before method with greater than dates - should print true
		output.println("Greater than dates - should print true");
		output.println(aSimpleDate2.before(greaterSimpleDateYear2));
		output.println(aSimpleDate2.before(greaterSimpleDateMonth2));
		output.println(aSimpleDate2.before(greaterSimpleDateDay2));
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
