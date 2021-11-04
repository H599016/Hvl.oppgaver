package no.hvl.dat100;

import easygraphics.*;

public class Grafikk extends EasyGraphics {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
			launch(args);
	}
	
	public void rund () {
		makeWindow("Grafikk", 350, 150);
		drawCircle(150, 70, 60);
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
