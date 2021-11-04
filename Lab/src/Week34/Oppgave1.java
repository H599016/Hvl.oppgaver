package Week34;

import javax.swing.JOptionPane;

public class Oppgave1 {
	public static void main (String[]args) {
		double a; double b;
		a = Double.parseDouble(JOptionPane.showInputDialog("Enter nr: "));
		b = Double.parseDouble(JOptionPane.showInputDialog("Enter nr: "));
		double c=a*b;
		JOptionPane.showMessageDialog(null, "Area [" + a + ", " + b + "] = " + c);
	}
}
