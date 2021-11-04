
public class copy {
	public int[] copy(int[] a){
		int[] b = null;
		b.length = a.length;
		for (int i=0; i<a.length; i++) {
			b[i]=a[i];
		}
		return b;
	}
}
