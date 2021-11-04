package Week36;

import javax.swing.JOptionPane;

public class G1 {
	public static void main (String[]args) {
		int n;
		n = Integer.parseInt(JOptionPane.showInputDialog("Enter number: "));
		for (int i = 0; i<n; i++) {
			System.out.println(i);
		}
	}

}
