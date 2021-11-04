package no.hvl.dat100;

public class Oppgave1 {
	public static void main(String[]args) {
		starFirkant(10);
		
	}
	public static void starFirkant(int a) {
		String star = "*";
		for (int i = 0; i < a; i++) {
			System.out.println(star);
			star = star+"*";
		}
	}

}
