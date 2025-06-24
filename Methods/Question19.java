import java.util.Scanner;

public class Question19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter kilometers: ");
        double km = scanner.nextDouble();
        System.out.println("Kilometers to Miles: " + convertKmToMiles(km));

        System.out.print("Enter miles: ");
        double miles = scanner.nextDouble();
        System.out.println("Miles to Kilometers: " + convertMilesToKm(miles));

        System.out.print("Enter meters: ");
        double meters = scanner.nextDouble();
        System.out.println("Meters to Feet: " + convertMetersToFeet(meters));

        System.out.print("Enter feet: ");
        double feet = scanner.nextDouble();
        System.out.println("Feet to Meters: " + convertFeetToMeters(feet));
    }

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }
}
