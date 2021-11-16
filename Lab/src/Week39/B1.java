package Week39;

public class B1 {
	public static void main(String[]args) {
		boolean[][] aud = 
			{ 
			  { false, false, false, false}, // rad 0
			  { false, false, true,  false}, // rad 1
			  { true,  false, true,  true }, // rad 2
			  { true,  true,  true,  true }, // rad 3
		};
		printTab(aud);
		ledigPlasser(aud);
		prosentPlasser(aud);
		smitteVern(aud);
	}
	public static void printTab(boolean[][] tab) {
		for (int i=0;i<tab.length;i++) {
			for(int j=0;j<tab[i].length;j++) {
				if (tab[i][j]==true) {
					System.out.print("X");
				}
				else {
					System.out.print("O");
				}
			}
			System.out.println();
		}
	}
	public static void ledigPlasser (boolean[][]tab) {
		int plasser=0;
		for (int i=0;i<tab.length;i++) {
			for(int j=0;j<tab[i].length;j++) {
				if (tab[i][j]==true) {
					plasser++;
				}
			}
		}
		System.out.println("Antall ledig plasser: " + plasser);
	}
	public static void prosentPlasser (boolean[][]tab) {
		double plasserTotal=0;
		double plasserOpptatt=0;
		for (int i=0;i<tab.length;i++) {
			for(int j=0;j<tab[i].length;j++) {
				if (tab[i][j]==true) {
					plasserOpptatt++;
				}
				plasserTotal++;
			}
		}
		double prosent = plasserOpptatt/(plasserTotal/100);
		prosent = 100-prosent;
		System.out.println("Prosent ledig plasser: " + prosent + "%");
	}
	public static void førsteLedig (boolean[][]tab) {
		boolean funnet = false;
		while (funnet = false) {
			for (int i=0;i<tab.length;i++) {
				for(int j=0;j<tab[i].length;j++) {
					if (tab[i][j]==false) {
						funnet = true;
					}
				}
			}
		}
		
	}
	public static void smitteVern(boolean[][]tab) {
		String melding = "Ingen smitte brudd";
		for (int i=0;i<tab.length;i++) {
			for(int j=0;j<tab[i].length;j++) {
				boolean plassEn = false;
				if (plassEn==true && tab[i][j]==true) {
					melding = "Smittevern brudd";
				}
				plassEn = tab[i][j];
			}
		}
		System.out.print(melding);
	}
	
}
