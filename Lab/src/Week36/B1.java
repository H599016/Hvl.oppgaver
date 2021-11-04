package Week36;

import javax.swing.JOptionPane;

public class B1 {
	public static void main (String[]args) {
		int high; int low;
		high = Integer.parseInt(JOptionPane.showInputDialog("Enter highest value: "));
		low = Integer.parseInt(JOptionPane.showInputDialog("Enter lowest value: "));
		
		while (low<high) {
			if (low%2 != 0) {
				System.out.println(low);
			}
			low++;
		}
	}

}
