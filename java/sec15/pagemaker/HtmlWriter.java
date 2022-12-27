package github.com.w40141.design_pattern_book.java.sec15.pagemaker;

import java.io.Writer;
import java.io.IOException;

/**
 * HtmlWriter
 */
public class HtmlWriter {
	private Writer writer;

	public HtmlWriter(Writer writer) {
		this.writer = writer;
	};

	public void title(String title) throws IOException {
		writer.write("<!DOCTYPE html>");
		writer.write("<html>");
		writer.write("<head>");
		writer.write("<title>" + title + "</title>");
		writer.write("</head>");
		writer.write("\n");
		writer.write("<h1>" + title + "</h1>");
		writer.write("\n");
	}

	public void paragraph(String msg) throws IOException {
		writer.write("<p>" + msg + "</p>");
		writer.write("\n");
	}

	public void link(String href, String caption) throws IOException {
		paragraph("<a href=\"" + href + "\">" + caption + "</a>");
	}

	public void mailTo(String mailAddr, String userName) throws IOException {
		link("mailTo: " + mailAddr, userName);
	}

	public void close() throws IOException {
		writer.write("</body>");
		writer.write("</html>");
		writer.write("\n");
		writer.close();
	}
}
