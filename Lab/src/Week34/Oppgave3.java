package Week34;

import javax.swing.JOptionPane;

public class Oppgave3 {
	public static void main(String[]args) {
		int day; int month; int year;
		String yearTxt = null;
		do {
		day = Integer.parseInt(JOptionPane.showInputDialog("Enter day"));
		if(day>=31 || day<=0) {
			JOptionPane.showMessageDialog(null, "Enter valid day");
		}
		}while (day>=31 || day<=0);
		do {
		month = Integer.parseInt(JOptionPane.showInputDialog("Enter month"));
		if (month<0 || month>12) {
			JOptionPane.showMessageDialog(null, "Enter valid month");
		}
		}while (month<0 || month>12);
		year = Integer.parseInt(JOptionPane.showInputDialog("Enter year"));
		
		if (year<0) {
			yearTxt = "bc";
			JOptionPane.showMessageDialog(null,day + "." + month + "." + year + yearTxt);
		}
		else {
		JOptionPane.showMessageDialog(null,day + "." + month + "." + year);
		}
	}

}
