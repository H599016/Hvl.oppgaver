package Week38;
import javax.swing.JOptionPane;

public class B2 {
	public static void main (String[]args) {
		String breddeStr = JOptionPane.showInputDialog("Bredde:");
		int bredde = Integer.parseInt(breddeStr);

		String hoydeStr = JOptionPane.showInputDialog("Høyde:");
		int hoyde = Integer.parseInt(hoydeStr);
		String h = "Høyde: ";
		String b = "Bredde: ";
		lesInnTall(h);
		lesInnTall(b);

		int a = areal(bredde,hoyde);

		JOptionPane.showMessageDialog(null,"Areal: " + a);
	}

	private static int areal(int bredde, int hoyde) {

		int flateareal = bredde * hoyde;

		return flateareal;
	}
	private static int lesInnTall(String dim) {
		String tallTxt = JOptionPane.showInputDialog(dim);
		int tall = Integer.parseInt(tallTxt);
		return tall;
	}
	}
