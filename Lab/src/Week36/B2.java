package Week36;

import javax.swing.JOptionPane;

public class B2 {
	public static void main (String[]args) {
		int a;
		int b;
		a = Integer.parseInt(JOptionPane.showInputDialog("Enter x"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Enter n"));
		System.out.println(power(a,b));
	}
	public static int power(int x, int n) {
		int y = 1;
		if (n>=1) {
			while (n>0) {
				y=(y*x);
				n--;
			}
		}
		return y;
	}

}
