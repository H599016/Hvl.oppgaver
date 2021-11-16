package ni.hvl.dat100;

public class Deltager {
	private int nr;
	private String navn;
	private double tid5H, tid5T, tid15H, tid10T;
	
	public Deltager (int nr, String navn, double tid5H, double tid5T, double tid15H, double tid10T) {
		this.nr = nr;			this.navn = navn;
		this.tid5H = tid5H; 	this.tid5T = tid5T;
		this.tid15H = tid15H;	this.tid10T = tid10T;
	}
	public double poengsum() {
		return tid5H + tid5T/10 + tid15H/3 + tid10T/20;
	}
	public String toString() {
		return nr + " " + navn + ": " + poengsum();
	}
}
