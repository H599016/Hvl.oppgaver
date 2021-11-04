package Week38;

import javax.swing.JOptionPane;

public class InputArray1 {
	public static void main(String[] args) {
		int[] tab =new int [6];
		for (int i=0;i<6;i++) {
			tab[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter nr " + i));
		}
		for (int i=0;i<6;i++) {
			System.out.print(tab[i] + ", ");
		}
	}

}
