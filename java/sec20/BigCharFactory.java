import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {
	private Map<String, BigChar> pool = new HashMap<>();
	private static BigCharFactory singleton = new BigCharFactory();

	private BigCharFactory() {
	}

	public static BigCharFactory getInstance() {
		return singleton;
	}

	public synchronized BigChar getBigChar(char charName) {
		BigChar bc = pool.get(String.valueOf(charName));
		if (bc == null) {
			bc = new BigChar(charName);
			pool.put(String.valueOf(charName), bc);
		}
		return bc;
	}
}
