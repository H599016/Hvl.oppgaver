package ni.hvl.dat100;

import static java.lang.Integer.*;
import javax.swing.JOptionPane;

public class Skoytelop {
	//klassevariabel
	private static Deltager[] l�perTab;
	
	public static void main (String[]args) {
		lesInnResultat();
		double best = bestePoengsum();
		visVinnere(best);
	}
	private static void lesInnResultat() {
		String antText = JOptionPane.showInputDialog("Antall l�pere:");
		int ant = parseInt(antTxt);
		l�perTab = new Deltager [ant];
		for (int nr=0; nr<ant; nr++) {
			l�perTab[nr] = lesDeltager();
		}
		
	}
	private static double bestePoengsum() {
		return 0;
		
	}
	private static void visVinnere (double best) {
		
	}
}
