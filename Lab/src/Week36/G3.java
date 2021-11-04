package Week36;

public class G3 {
	public static void main (String[]args) {
		for (int i =1; i<=20;i++) {
			System.out.println(i);
			switch (i) {
			case 1:
				break;
			case 2:
				System.out.println("b");
				break;
			default:
				System.out.println("c");
				break;
			}
			System.out.println();
		}
	}
}
