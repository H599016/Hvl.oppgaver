
public class Test {
	public static void main (String[]args) {
		
		int[] myArray = {5,2,6,8,5,3};
		
		for (int i=0; i<myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		System.out.println();
		double[] obs = new double [11];
		for (int i = 0; i<obs.length; i++) {
			obs[i]= i*5;
		}
		for (int i=0; i<obs.length; i++) {
			System.out.println(obs[i]);
		}
	}
}
