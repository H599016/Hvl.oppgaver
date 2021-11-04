package Week34;

import javax.swing.JOptionPane;

public class Oppgave2 {
	public static void main (String[]args) {
		int a; int b; int c; int d;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Enter nr: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Enter nr: "));
		c = Integer.parseInt(JOptionPane.showInputDialog("Enter nr: "));
		d = Integer.parseInt(JOptionPane.showInputDialog("Enter nr: "));
		
		int i; int j; int k;
		
		i = Math.min(a, b);
		j = Math.min(c, d);
		k = Math.min(i, j);
		
		JOptionPane.showMessageDialog(null, "Smalest out of [" + a + ", " + b + ", " + c + ", " + d + "] is " + k);
	}
}
