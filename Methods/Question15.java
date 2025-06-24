import java.util.Scanner;

public class Question15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Fahrenheit: ");
        double f = scanner.nextDouble();
        System.out.println("Fahrenheit to Celsius: " + convertFahrenheitToCelsius(f));

        System.out.print("Enter Celsius: ");
        double c = scanner.nextDouble();
        System.out.println("Celsius to Fahrenheit: " + convertCelsiusToFahrenheit(c));

        System.out.print("Enter Pounds: ");
        double pounds = scanner.nextDouble();
        System.out.println("Pounds to Kilograms: " + convertPoundsToKilograms(pounds));

        System.out.print("Enter Kilograms: ");
        double kg = scanner.nextDouble();
        System.out.println("Kilograms to Pounds: " + convertKilogramsToPounds(kg));

        System.out.print("Enter Gallons: ");
        double gallons = scanner.nextDouble();
        System.out.println("Gallons to Liters: " + convertGallonsToLiters(gallons));

        System.out.print("Enter Liters: ");
        double liters = scanner.nextDouble();
        System.out.println("Liters to Gallons: " + convertLitersToGallons(liters));
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
}
