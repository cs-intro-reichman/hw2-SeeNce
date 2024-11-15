// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) {
		int n = Integer.parseInt(args[0]);
		double newPi = 1;
		double temp = 3.0;
		for (int i = 0; i < n-1; i++) {
			if (i % 2 == 0) {
				newPi = newPi - (1.0 / temp);
			} else newPi = newPi + (1.0 / temp);

			temp+=2.0;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + newPi * 4.0);

	}
}
