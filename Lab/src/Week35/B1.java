package Week35;
import javax.swing.JOptionPane;

public class B1 {
	public static void main(String[]args) {
		String tallTxt = JOptionPane.showInputDialog("Enter radius: ");
		double r = Double.parseDouble(tallTxt);
		Double v = (Math.pow(Math.PI,r));
		Double volume = (4/3)*v;
		System.out.println("Volume of sphere with radius: " + r + " = " + volume);
	}

}
