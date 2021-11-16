package ni.hvl.dat100;

import static java.lang.Integer.*;
import javax.swing.JOptionPane;

public class Skoytelop {
	//klassevariabel
	private static Deltager[] løperTab;
	
	public static void main (String[]args) {
		lesInnResultat();
		double best = bestePoengsum();
		visVinnere(best);
	}
	private static void lesInnResultat() {
		String antText = JOptionPane.showInputDialog("Antall løpere:");
		int ant = parseInt(antTxt);
		løperTab = new Deltager [ant];
		for (int nr=0; nr<ant; nr++) {
			løperTab[nr] = lesDeltager();
		}
		
	}
	private static double bestePoengsum() {
		return 0;
		
	}
	private static void visVinnere (double best) {
		
	}
}
