package cui;

public class FaculteitCalculator {
	public void toonFaculteiten() {
		for (int i = 0; i <= 10; i++) {
			System.out.printf("%d! = %d%n", i, faculteit(i));
		}
	}

	public long faculteit(int getal) { // <1>
		if (getal < 0) // <5>
			throw new IllegalArgumentException("Geen natuurlijk getal");
		if (getal == 0) // <2>
			return 1; // <3>
		return getal * faculteit(getal - 1); // <4>
	}
}
