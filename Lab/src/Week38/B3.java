package Week38;
import easygraphics.*;
public class B3 extends EasyGraphics {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
	    launch(args);
	  }

	  public void run() {
	    makeWindow("Murvegg");

	    int xStart = 100, yStart = 350;
	    int xStr = 80, yStr = 50;
	    int bredde = 7, høyde = 5;
	    int x=xStart, y=yStart;

	    for (int rad=1; rad<=høyde; rad++) {
	      if ( rad%2 == 1 ) {
	         // Oddetallsrader starter med en halv-sten
	         drawRectangle(x, y, xStr/2, yStr);
	         x += xStr/2;
	         pause(180);
	      }
	      for (int stein=1; stein<=bredde; stein++) {
	        drawRectangle(x, y, xStr, yStr);
	        x += xStr;
	        pause(180);
	      }
	      if ( rad%2 == 0 ) {
	        // Partallsrader slutter med en halv-sten
	        drawRectangle(x, y, xStr/2, yStr);
	        pause(150);
	      }
	      x = xStart;
	      y -= yStr;
	    }
	  }

	}