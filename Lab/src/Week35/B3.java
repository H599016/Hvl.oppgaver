package Week35;

import javax.swing.JOptionPane;
public class B3 {
	public static void main (String[]args) {
		String passord = "java123";
		String brukernavn = "jakob123";
		
		String brukernavnInput = JOptionPane.showInputDialog(null, "Brukernavn: ");
		String passordInput = JOptionPane.showInputDialog(null, "Passord: ");
		
		System.out.println(passordInput + " " + brukernavnInput);
		passord.equals(passordInput);
		if (passord.equals(passordInput) == true && brukernavn.equals(brukernavnInput) == true) {
			JOptionPane.showMessageDialog(null, "Logging in...");
			System.exit(0);
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong password or username.");
			System.exit(0);
		}
	}

}
