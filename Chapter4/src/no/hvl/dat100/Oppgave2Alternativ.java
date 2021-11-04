package no.hvl.dat100;
import static java.lang.System.*;
import javax.swing.JOptionPane;
public class Oppgave2Alternativ {
	
	 public static void main(String[] args) {
		    int nivå;
		    nivå = Integer.parseInt(JOptionPane.showInputDialog(null, "Input level: "));
		    skrivPil(nivå);
		  }

		  public static void skrivPil(int nivåLinje) {
		    // Først lengre og lengre linjer...
		    for (int linje=1; linje<=nivåLinje; linje++)
		      skrivTegn('>', 2*linje-1);

		    // Deretter kortere og kortere linjer igjen...
		    for (int linje=nivåLinje-1; linje>=1; linje--)
		      skrivTegn('>', 2*linje-1);
		  }

		  public static void skrivTegn(char t, int antall) {
		    for (int i=1; i<=antall; i++)
		      out.print(t);
		    out.println();
		  }

}
