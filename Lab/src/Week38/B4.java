package Week38;

import javax.swing.JOptionPane;

public class B4 {
	public static void main (String[]args) {
		//Temp leser for 7 dager i Bergen
		float[] temp = new float[7];
		for(int i=0; i<7;i++) {
			temp[i]=Float.parseFloat(JOptionPane.showInputDialog("Enter temperature day" + (i+1)));
		}
		System.out.println("Analyse av temperatur");
		stars();
		printTab(temp);
		gjennomsnitt(temp);
		highTemp(temp);
		
	}
	public static void stars() {
		for (int i=0;i<21;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	public static void printTab(float[] temp) {
		String d = "dag";
		for (int i=0;i<7;i++) {
			System.out.println(d + " " + (i+1) + ": " + temp[i]);
		}
	}
	public static void gjennomsnitt(float[]temp) {
		float sum=0;
		for (int i=0;i<7;i++) {
			sum = sum+temp[i];
		}
		float average = sum/7;
		System.out.println("Gjennomsnittstemperaturen var " + average);
	}
	public static void highTemp(float[]temp) {
		float high=0;
		for (int i=0;i<7;i++) {
			if(temp[i]>high) {
				high=temp[i];
			}
		}
		System.out.println("Høyeste temperatur: " + high);
	}

}