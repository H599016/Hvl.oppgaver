package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Oppgave8 {
	public static void main(String[]args) {
		double prisBase = 5;
		double age; double pris;
		do {
			age = Integer.parseInt(JOptionPane.showInputDialog("How old are you? "));
			if (age <  1 || age > 110) {
				JOptionPane.showMessageDialog(null, "Error, input legal age");
			}
			}while (age <  1 || age > 110);
		if(age < 13 || age > 70 || age > 5) {
			pris = prisBase/2;
		}
		if(age < 5) {
			pris = 0;
		}
		else {
			pris = prisBase;
		}
		JOptionPane.showMessageDialog(null, "Price: " + pris);
		
	}

}
