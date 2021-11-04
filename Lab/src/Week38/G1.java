package Week38;

public class G1 {
	public static void main(String[]args) {
		int[] tabell = {1,3,4,7,9,10};
		System.out.println(tabell[2]);
		tabell[2] = 7;
		System.out.println();
		skrivUt(tabell);
		finnes(tabell, 10);

	}
	public static void skrivUt(int[] tab) {
			for (int i = 0; i<tab.length;i++) {
				System.out.println(tab[i]);
		}
	}
	public static void finnes(int[] tab, int tall) {
		boolean test = false;
		for (int i =0; i<tab.length;i++) {
			if (tab[i]==tall) {
				test = true;
			}
		}
		System.out.print(test);
	}

}
