package cui;

public class FibonacciCalculator {
	// tag::fibonacci[]
	public long fibonacci(int getal) {
		// tag::exception[]
		if (getal < 0)
			throw new IllegalArgumentException("Geen natuurlijk getal");
		// end::exception[]
		if ((getal == 0) || (getal == 1)) // <1>
			return getal; // <2>
		return fibonacci(getal - 1) + fibonacci(getal - 2); // <3>
	}
	// end::fibonacci[]

	public void toonReeks(int aantalGetallen) {
		System.out.printf("De eerste %d getallen in de reeks van fibonacci:%n", aantalGetallen);
		for (int i = 0; i < aantalGetallen; i++)
			System.out.printf("%d%s", fibonacci(i), i < aantalGetallen - 1 ? ", " : "");
	}
}
