import java.util.Scanner;

public class Question7 {
    
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();

        double[] results = calculateTrigonometricFunctions(angle);

        System.out.println("Sine of " + angle + "° = " + results[0]);
        System.out.println("Cosine of " + angle + "° = " + results[1]);
        System.out.println("Tangent of " + angle + "° = " + results[2]);
    }
    
}
