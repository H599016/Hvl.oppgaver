package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Oppgave3 {
	public static void main(String[]args) {
		int choice = 0;
		String unit = null;
		double nrOg = 0;
		double nr = 0;
		do {
		choice = Integer.parseInt(JOptionPane.showInputDialog("Type 1 for cm to inch"+"/n"+"Type 0 for inch to cm"));
		if (choice = !0 || (choice = !(1))) {
			JOptionPane.showMessageDialog(null, "Try again.");
		}
		}while (choice !=0 || choice !=1);
		if (choice == 0) {
			nr = Double.parseDouble(JOptionPane.showInputDialog(null,"Input inches: "));
			nrOg =nr;
			inchCm(nr);
			unit = "cm";
		}
		if (choice == 1) {
			nr = Double.parseDouble(JOptionPane.showInputDialog(null,"Input cm: "));
			nrOg =nr;
			cmInch(nr);
			unit = "inches";
		}
		JOptionPane.showMessageDialog(null, nrOg + " = " + nr + unit);
	}
	public static double cmInch(double a) {
		a=a/2.54;
		return a;
	}
	public static double inchCm(double a) {
		a=a*2.54;
		return a;
	}

}
