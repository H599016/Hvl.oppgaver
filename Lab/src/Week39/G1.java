package Week39;

import javax.swing.JOptionPane;

public class G1 {
	public static void main(String[] args) {

	    double[][] obs = {
	    				{1.4,1.7,1.9,2.0},
	    				{5.4,7.8,9.8,7.9,3.0},
	    				{-1.7,-1.7,-2.8}
	    		};
	    skrivUt(obs);
	    System.out.println();
	    System.out.println(obs.length);
	    //obs.length har verdi 3 siden det er 3 tabeller i tab 1. Vises bra visuelt fra linje 7-9.
	    System.out.println(obs[0].length);
	    System.out.println(obs[1].length);
	    System.out.println(obs[2].length);
	    //obs[i].length skriver ut lengden på de indre tabellene
	    double search = Double.parseDouble(JOptionPane.showInputDialog("Enter search nr: "));
	    System.out.print(finnes(obs,search));
	    //TODO: Skriv kode for å bytte plass på obs[0] og obs[2]
}
	public static void skrivUt (double[][] tabell) {
		for (int i = 0; i<tabell.length;i++) {
			for (int j=0; j<tabell[i].length;j++) {
				System.out.print(tabell[i][j] + ", ");
			}
		}
	}
	public static boolean finnes(double[][] obs, double limit) {
		boolean finnes = false;
		for (int i=0;i<obs.length;i++) {
			for(int j=0;j<obs[i].length;j++) {
				if(obs[i][j]>limit) {
					finnes = true;
				}
			}
		}
		return finnes;
	}
}
