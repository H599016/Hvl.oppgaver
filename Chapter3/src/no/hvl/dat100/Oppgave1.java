package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Oppgave1 {
	
	public static void main(String[]args) {
		
		double a;
		do {
		a = Double.parseDouble(JOptionPane.showInputDialog(null, "input nr =/ 0: "));
		if (a==0) {
			JOptionPane.showMessageDialog(null, "Error, can't be 0");
			
		}
		}while (a==0);
		double b;
		do {
			b = Double.parseDouble(JOptionPane.showInputDialog(null, "input nr =/ 0: "));
			if (b==0) {
				JOptionPane.showMessageDialog(null, "Error, can't be 0");
				
			}
			}while (b==0);
		
		double c = a/b;
		JOptionPane.showMessageDialog(null, a + " / " + b + " = " + c);
	}

}
