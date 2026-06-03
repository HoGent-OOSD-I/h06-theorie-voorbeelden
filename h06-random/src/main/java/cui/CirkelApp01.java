package cui;

import java.security.SecureRandom;

public class CirkelApp01 {

	public static void main(String[] args) {
			
		new CirkelApp01().werkMetRandom();
	}
		
	private void werkMetRandom(){
			
		final int MIN = 1;
		final int MAX = 100;
		SecureRandom random = new SecureRandom(); // <1>
		for (int i = 0; i < 10; i++) {
			int straal = random.nextInt(MIN, MAX+1); // <2>
			System.out.printf("Cirkel met straal %d%n", straal);
		}
	}
}
