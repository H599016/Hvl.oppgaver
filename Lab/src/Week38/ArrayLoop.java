package Week38;

public class ArrayLoop {
	public static void main(String[]args) {
		int[] tab = {5,2,8,45,2,78,9,4};
		forMethod(tab);
		System.out.println();
		//otherMethod(tab);
	}
	public static void forMethod(int[] tab) {
		for (int i =0; i<tab.length;i++) {
			System.out.print(tab[i] + ", ");
		}
	}
	public static void otherMethod(int[]tab) {
		for (int i : tab) {
			System.out.println(tab[i]);
		}
		
	}

}
