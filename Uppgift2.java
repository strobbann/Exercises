import java.util.Scanner;
public class Uppgift2 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Hastighet i km/timme:");
		double velocity = in.nextDouble();
		System.out.println();
		System.out.print("Tid (i minuter): ");
		double timeFromMinutes = minutesToHours(in.nextDouble());
		System.out.println();
		System.out.print("Tid (i sekunder): ");
		double timeFromSeconds = secondsToHours(in.nextDouble());
		System.out.println();
		
		double time = (double) timeFromMinutes + timeFromSeconds;
		
		double distance = calculateDistance(velocity, time);
		System.out.println("Du har färdats " + kmToMeters(distance) + " meter!");
		
	}
	public static double minutesToHours(double minutes){
		return minutes/60;
	}
	public static double secondsToHours(double seconds) {
		return (seconds/60)/60;
	}
	
	public static double kmToMeters(double distance){
		return distance * 1000;
	}
	
	public static double calculateDistance(double velocity, double time) {
		return velocity * time;
	}
		

}