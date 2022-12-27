package pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import pagemaker.HtmlWriter;

/**
 * PageMaker
 */
public class PageMaker {

	private PageMaker() {
	}

	public static void makeWelcomePage(String mailAddr, String fileName) {
		try {
			Properties mailProp = Database.getProperties("maildata");
			String userName = mailProp.getProperty(mailAddr);
			HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
			writer.title(userName + "'s web page");
			writer.paragraph("Welcome to " + userName + "'s web page!");
			writer.paragraph("Nice to meet you!");
			writer.mailTo(mailAddr, userName);
			writer.close();
			System.out.println(fileName + " is created for " + mailAddr + " (" + userName + ")");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void makeLinkPage(String fileName) {
		try {
			HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
			Properties mailProp = Database.getProperties("maildata");
			writer.title("Link Page");
			for (String mailAddr : mailProp.stringPropertyNames()) {
				String userName = mailProp.getProperty(mailAddr);
				writer.mailTo(mailAddr, userName);
			}
			writer.close();
			System.out.println(fileName + " is created.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
