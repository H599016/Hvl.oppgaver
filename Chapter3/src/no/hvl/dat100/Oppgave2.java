package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Oppgave2 {

  public static void main(String[] args) {
    String tallTxt = showInputDialog("Gi tall nr 1: a = ");
    int a = parseInt(tallTxt);
    tallTxt = showInputDialog("Gi tall nr 2: b = ");
    int b = parseInt(tallTxt);
    tallTxt = showInputDialog("Gi tall nr 3: c = ");
    int c = parseInt(tallTxt);

    String ut = "Sorterte tall: ";

    if ( a < b )
      if ( b < c )
    	  ut += a + " " + b + " " + c;
      else  // da vet vi at  c <= b
        if ( a < c )
    	    ut += a + " " + c + " " + b;
        else
    	    ut += c + " " + a + " " + b;
    else // da vet vi at  b <= a
      if ( a < c )
    	  ut += b + " " + a + " " + c;
      else  // da vet vi at  c <= a
        if ( b < c )
    	    ut += b + " " + c + " " + a;
        else
    	    ut += c + " " + b + " " + a;

    showMessageDialog(null, ut);
  }

}