package Week35;

import javax.swing.JOptionPane;

import static java.lang.Integer.*;

public class G2 {
	public static void main(String[]args) {
		for (int i=0; i<5; i++) {
		String tallTxt = JOptionPane.showInputDialog("Sgi et tall: ");
		int tall = parseInt(tallTxt);
		System.out.println(tall);
		}
	}

}
