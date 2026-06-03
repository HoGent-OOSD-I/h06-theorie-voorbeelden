package cui;

import java.util.EnumSet;

import utils.Dag;

public class EnumDemo01 {

	public static void toonAlleDagen() {
		System.out.printf("%nAlle dagen van de week: ");
		for (Dag d : Dag.values()) { // <1>
			System.out.print(d.name() + " "); // <2>
		}
	}

	public static void toonLangWeekend() {
		System.out.printf("%nLang weekend: ");
		for (Dag d : EnumSet.range(Dag.VRIJDAG, Dag.ZONDAG)) { // <3>
			System.out.print(d.name() + " ");
		}
	}

	public static void toonDagMetOrdinaalWaarde(int ordinaalWaarde) {
		System.out.printf("%nDag %d is %s", ordinaalWaarde, Dag.values()[ordinaalWaarde]); // <4>
	}
}
