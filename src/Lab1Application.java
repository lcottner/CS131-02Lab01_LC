
public class Lab1Application {
	public static void main (String[]args) {
	Rectangle rect=new Rectangle(5,4);
	System.out.println("What is the area of a rectangle with a length of 5 and a width of 4? " +rect.calculateArea());
	
	System.out.println("What is the distance between (2,4) and (5,7)? "+ DistanceCalculator.calculateDistance(2, 4, 5, 7));
	
	System.out.println("What is 6 divided by 2? " + BasicMath.divide(6, 2));

	DateManipulator dm = new DateManipulator();
	System.out.println("Is the year 1600 a leap year? "+ dm.isLeapYear(1600));
	}
}
