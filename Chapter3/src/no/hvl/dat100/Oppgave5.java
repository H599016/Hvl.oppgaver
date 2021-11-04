package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Oppgave5 {
	public static void main(String[]args) {
		int mnd;
		do {
		mnd = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter month nr: "));
		if (mnd >12 || mnd <1) {
			JOptionPane.showMessageDialog(null, "Error, must be 1-12");
		}
		}while (mnd >12 || mnd <1);
		switch (mnd) {
		case 1:
			JOptionPane.showMessageDialog(null,"January");
			break;
		case 2:
			JOptionPane.showMessageDialog(null,"February");
			break;
		case 3:
			JOptionPane.showMessageDialog(null,"March");
			break;
		case 4:
			JOptionPane.showMessageDialog(null,"April");
			break;
		case 5:
			JOptionPane.showMessageDialog(null,"May");
			break;
		case 6:
			JOptionPane.showMessageDialog(null,"June");
			break;
		case 7:
			JOptionPane.showMessageDialog(null,"July");
			break;
		case 8:
			JOptionPane.showMessageDialog(null,"August");
			break;
		case 9:
			JOptionPane.showMessageDialog(null,"September");
			break;
		case 10:
			JOptionPane.showMessageDialog(null,"October");
			break;
		case 11:
			JOptionPane.showMessageDialog(null,"November");
			break;
		case 12:
			JOptionPane.showMessageDialog(null,"December");
			break;
		}
		}
}
