package pagemaker;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Database
 */
class Database {

	private Database() {
	}

	public static Properties getProperties(String dbName) throws IOException {
		String fileName = dbName + ".txt";
		Properties prop = new Properties();
		prop.load(new FileReader(fileName));
		return prop;
	}
}
