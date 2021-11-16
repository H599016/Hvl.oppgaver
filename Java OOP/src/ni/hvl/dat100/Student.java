package ni.hvl.dat100;

public class Student {
	int studentNr;
	String fornavn;
	String etternavn;

	public void skrivUt() {
		System.out.println(this.fornavn + " " + this.etternavn + ". Student nr: " + this.studentNr);
	}
}
