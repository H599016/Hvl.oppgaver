import java.util.Arrays;

public class LottoTest {
	public static boolean sjekkKupong(int[] kupong, int[] lottotall) {
		Arrays.sort(kupong);
		Arrays.sort(lottotall);
		
		return Arrays.equals(kupong, lottotall);
	}

}
