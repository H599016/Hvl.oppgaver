package ni.hvl.dat100;

public class Skole {
	public static void main(String[]args) {
		Student s1;
		s1 = new Student();
		s1.fornavn = "Jakob";
		s1.etternavn = "Sandtr�en";
		s1.studentNr = 01;
		
		s1.skrivUt();
		
		Rektangel r1 = new Rektangel(200,100,20,10);
		System.out.println(r1.vis());
		r1.flytt(40, 80);
		System.out.println(r1.vis());
		r1.st�rrelse(25, 15);
		System.out.println(r1.vis());
		System.out.println("Omkrets: " + r1.omkrets());
	}
}
