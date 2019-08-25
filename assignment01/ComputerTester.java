package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different 
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
	
		// Create 4 computer objects
		Computer computer1 = new Computer("Dell", "Intel i7", 16, 500, false, 1000.00);
		Computer computer2 = new Computer("IBM", "Intel i5", 32, 2000, true, 1200.00);
		Computer computer3 = new Computer("HP", "AMD", 64, 2750, false, 1800.94);
		Computer computer4 = new Computer("Compaq", "Intel i3", 8, 250, true, 799.99);
		
		// Print 4 computer objects to screen
		System.out.println(computer1);
		System.out.println(computer2);
		System.out.println(computer3);
		System.out.println(computer4);
	
		try(var output = new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

			// Create 4 computer objects
			Computer computer12 = new Computer("Dell", "Intel i7", 16, 500, false, 1000.00);
			Computer computer22 = new Computer("IBM", "Intel i5", 32, 2000, true, 1200.00);
			Computer computer32 = new Computer("HP", "AMD", 64, 2750, false, 1800.94);
			Computer computer42 = new Computer("Compaq", "Intel i3", 8, 250, true, 799.99);
			
			// Print 4 computer objects to file "output.txt"
			output.println(computer12);
			output.println(computer22);
			output.println(computer32);
			output.println(computer42);
			
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}