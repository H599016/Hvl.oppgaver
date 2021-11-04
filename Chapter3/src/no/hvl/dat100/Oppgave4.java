package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Oppgave4 {
	
	public static void main(String[]args) {
		int a;
		do {
		a = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter personal nr."));
		if ((a>99999) || (a < 9999)) {
			JOptionPane.showMessageDialog(null, "Error, has to be 5 nr");
		}
		} while ((a>99999) || (a < 9999));
		
		int b = (a / 100) % 10;
		if (b %2 == 0) {
			System.out.println("You're a girl");
		}
		else {
			System.out.println("you're a guy");
		}
	}
}
