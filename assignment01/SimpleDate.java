package assignment01;

public class SimpleDate {
	private int year;
	private int month;
	private int day;
	
	/**
	* @param aYear: year of date
	* @param aMonth: month of date
	* @param aDay: day of date
	*/
	public SimpleDate(int aYear, int aMonth, int aDay) {
			year = aYear;
			month = aMonth;
			day = aDay;
		}
	
	/**
	* function to combine a simple date object
	* @param yr: year of date
	* @param m: month of date
	* @param d: day of date
	* @return returnValue: date to return
	*/
	public static SimpleDate of(int yr, int m, int d) {
		SimpleDate returnValue = new SimpleDate(yr, m, d);
		
		returnValue.year = yr;
		returnValue.month = m;
		returnValue.day = d;
		
		return returnValue;
	}
	
	/**
	* function to check if other date is before current date
	* @param other: SimpleDate object 
	* @return return true if other is greater than, false otherwise, same date is true
	*/
	public boolean before(SimpleDate other) {
		if (year > other.year) {
			return false;
		}
		else if (month > other.month) {
			return false;
		}
		else if (day > other.day) {
			return false;
		}
		
		return true;
	}
	
	// Create to string method
	@Override
	public String toString() {
		return String.format("%d %d %d", year, month, day);
	}
}
