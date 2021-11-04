package Week35;

import javax.swing.JOptionPane;

public class B2 {
	public static void main (String[]args) {
		int Beløp; int pris;
		
		do {
			String tallPris = JOptionPane.showInputDialog("Pris: ");
			pris = Integer.parseInt(tallPris);
			String tallBeløp = JOptionPane.showInputDialog("Beløp: ");
			Beløp = Integer.parseInt(tallBeløp);
			if(pris>Beløp) {
				JOptionPane.showMessageDialog(null, "For dyrt");
				System.exit(0);
			}
		}while (pris>Beløp);
		int rest;
		rest = Beløp-pris;
		
		System.out.println(rest);
		int tiKr = rest%5;
		System.out.println(tiKr);
	}

}
