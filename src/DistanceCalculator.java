
public class DistanceCalculator {

	private DistanceCalculator() {
		
	}//end empty argument constructor
	
	public static double calculateDistance(int x, int y, int a, int b) {
		double test= Math.pow(b-y,2)+Math.pow(a-x,2);
		test=Math.pow(test,0.5);
		return test;
	}//end calculateDistance
	
}//end class