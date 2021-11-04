import javax.swing.JOptionPane;

public class TabSearch {
	public static void main(String[]args) {
		
		double[] obs = {1,3,5,6,778,4,23,5,7};
		int a;
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter search nr: "));
		System.out.println("Are there numbers over " + a + "?");
		System.out.println(finnesOver(obs,a));
		if(finnesOver(obs,a) == true) {
			System.out.println();
			System.out.println("Numbers larger then " + a + ":");
			System.out.println(antallOver(obs,a));
		}

	}
	
	
	private static boolean finnesOver(double[] tab, int grense) {
		
		boolean funnet = false;
		int i=0;
		
		while (i<tab.length && (!funnet)) {
			if (tab[i]> grense) {
				funnet = true;
			}
			i++;
		}
		return funnet;
	}
	
	private static int antallOver(double[] tab, int grense) {
		int antall = 0;
		for (int i = 0; i<tab.length; i++) {
			if (tab[i]>grense) {
				antall++;
			}
		}
		return antall;
	}

}
