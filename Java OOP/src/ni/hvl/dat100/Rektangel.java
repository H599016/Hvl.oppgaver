package ni.hvl.dat100;

public class Rektangel {
	int x; //posisjon for øvre
	int y; //venstre hjørne i (x,y)
	int b; //rektangeles bredde
	int h; //rektabgeles høyde 
	
	public Rektangel (int x, int y, int b, int h) {
		this.x = x;		this.y = y;
		this.b = b;		this.h = h;
	}
	public void størrelse (int b, int h) {
		this.b = b;		this.h = h;
	}
	public void flytt (int dx, int dy) {
		this.x += dx;	this.y += dy;
	}
	public double omkrets() {
		return 2*b + 2*h;
	}
	public String vis() {
		return "("+x+" ,"+y+") - B="+b+", H="+h;
	}
}
