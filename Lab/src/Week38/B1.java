package Week38;

public class B1 {
	public static void main(String []args) {
		double[] grader = new double [13];
		double[] radianer = new double [13];
		double[] cosX = new double [13];
		double[] sinX = new double [13];
		
		grader180(grader);
		grader180(radianer);
		grader180(cosX);
		grader180(sinX);
		
		System.out.print("x i grader");
		printSpace();
		System.out.print("x i radianer");
		printSpace();
		System.out.print("sin(x)");
		printSpace();
		System.out.print("cos(x)");
		System.out.println();
		printLine();
		System.out.println();
		
		for(int i=0; i<13;i++) {
			radianer[i]=(double) (Math.PI*(grader[i])/180);
		}
		for (int i=0;i<13;i++) {
			Math.round(radianer[i]);
		}
		printTab(radianer);
		//Todo
		//for løkke som lager sinX og cosX
		//Finne en pen printe metode
	}
	static void printTab(double[] tab) {
		for (int i = 0; i<tab.length;i++) {
			System.out.print(tab[i]+", ");
		}
	}
	static void printSpace(){
		System.out.print("   ");
	}
	static void printLine() {
		for (int i=0;i<45;i++) {
			System.out.print("-");
		}
	}
	static double[] grader180(double[]tab) {
		for (int i = 0; i<13;i++) {
			tab [i]=(i*15);
		}
		return tab;
	}
}
