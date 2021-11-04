package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Oppgave4 {
	public static void main (String[]args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter integer: "));
		fakultet(x);
		System.out.println(x);
	}
	public static int fakultet(int a) {
		int b = 0;
		for (int i =0; i>a;i++) {
			b = b+i;
		 }
		return b;
	}

}
