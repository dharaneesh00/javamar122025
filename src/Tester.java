public class Tester {
	public static void main(String[] args) {
		double a = 1, b = 4, c = 4;

		// Correct formula for discriminant
		double discriminant = (b * b) - (4 * a * c);

		if (discriminant > 0) {
			// Two distinct real roots
			double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			System.out.println("The real roots are " + root1 + " and " + root2);
		} else if (discriminant == 0) {
			// One real root
			double root = -b / (2 * a);
			System.out.println("The real root is " + root);
		} else {
			// No real roots
			System.out.println("The equation has no real roots");
		}
	}
}
