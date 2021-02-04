/**
 * This class contains several methods for manipulating dates.
 * @author Lacey Cottner
 * @version 1.0
 * Lab07 - DateManipulator
 * Fall 2018
 */
public class DateManipulator {

	/**
	 * Empty-argument constructor
	 */
	public DateManipulator() {
		
	}//end constructor
	
	/**
	 * This method determines if a year is a leap year. Years 
	 * less than 1582 return -1 (not valid leap years). Otherwise
	 * the year must be evenly divisible by 4 or 400. However, years
	 * divisible by 100 are not leap years (although they are divisible
	 * by 4.
	 * @param year - four-digit integer representing a year.
	 * @return - true or false
	 */
	public boolean isLeapYear(int year) {
		if (year<1582)
		return false;
		
		if (year%4==0)
			if (year%100==0)
				if (year%400==0)
					return true;
				else
					return false;
			else
				return true;
		else
			return false;
		
		
	}//end isLeapYear
}//end class