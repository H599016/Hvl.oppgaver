package no.hvl.dat100;

public class Oppgave2 {
	public static void main(String[]args) {
		arrow();
	}
	public static void arrow() {
		String arrow = ">";
		for (int i = 0; i < 5;i++) {
			System.out.println(arrow);
			arrow = arrow+">>";
		}
		for (int i = 5; i > 2;i--) {
			arrow = arrow.replace(">>>",">");
			System.out.println(arrow);
			
		}
	}
}
