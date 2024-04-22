import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		double coeficienteA, coeficienteB, coeficienteC;
		double x1, x2, delta;

		System.out.print("Coeficiente A: ");
		coeficienteA = scanner.nextDouble();
		System.out.print("Coeficiente B: ");
		coeficienteB = scanner.nextDouble();
		System.out.print("Coeficiente C: ");
		coeficienteC = scanner.nextDouble();

		delta = (coeficienteB * coeficienteB) - 4 * coeficienteA * coeficienteC;

		if (delta >= 0) {
			x1 = (-coeficienteB + Math.sqrt(delta)) / (2 * coeficienteA);
			x2 = (-coeficienteB - Math.sqrt(delta)) / (2 * coeficienteA);

			System.out.printf("x1: %.4f%n", x1);
			System.out.printf("x2: %.4f",x2);

		} else {
			System.out.println("Esta equação não possui raízes reais!");
		}
		scanner.close();

	}
}
