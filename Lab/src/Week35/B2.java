package Week35;

import javax.swing.JOptionPane;

public class B2 {
	public static void main (String[]args) {
		int Bel�p; int pris;
		
		do {
			String tallPris = JOptionPane.showInputDialog("Pris: ");
			pris = Integer.parseInt(tallPris);
			String tallBel�p = JOptionPane.showInputDialog("Bel�p: ");
			Bel�p = Integer.parseInt(tallBel�p);
			if(pris>Bel�p) {
				JOptionPane.showMessageDialog(null, "For dyrt");
				System.exit(0);
			}
		}while (pris>Bel�p);
		int rest;
		rest = Bel�p-pris;
		
		System.out.println(rest);
		int tiKr = rest%5;
		System.out.println(tiKr);
	}

}
